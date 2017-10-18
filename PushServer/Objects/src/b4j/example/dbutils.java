package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class dbutils extends Object{
public static dbutils mostCurrent = new dbutils();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.dbutils", null);
		ba.loadHtSubs(dbutils.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.dbutils", ba);
		}
	}
    public static Class<?> getObject() {
		return dbutils.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _db_real = "";
public static String _db_integer = "";
public static String _db_blob = "";
public static String _db_text = "";
public static String _htmlcss = "";
public static b4j.example.main _main = null;
public static b4j.example.iosfeedback _iosfeedback = null;
public static b4j.example.iospush _iospush = null;
public static b4j.example.httputils2service _httputils2service = null;
public static b4j.example.webutils _webutils = null;
public static b4j.example.androidpush _androidpush = null;
public static anywheresoftware.b4a.objects.collections.List  _executememorytable(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs,int _limit) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executememorytable"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "executememorytable", new Object[] {_sql,_query,_stringargs,_limit});
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _values = null;
int _col = 0;
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Public Sub ExecuteMemoryTable(SQL As SQL, Query As";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="If StringArgs = Null Then";
if (_stringargs== null) { 
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="Dim StringArgs(0) As String";
_stringargs = new String[(int) (0)];
java.util.Arrays.fill(_stringargs,"");
 };
RDebugUtils.currentLine=4718597;
 //BA.debugLineNum = 4718597;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = _sql.ExecQuery2(_query,anywheresoftware.b4a.keywords.Common.ArrayToList(_stringargs));
RDebugUtils.currentLine=4718599;
 //BA.debugLineNum = 4718599;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4718600;
 //BA.debugLineNum = 4718600;BA.debugLine="table.Initialize";
_table.Initialize();
RDebugUtils.currentLine=4718601;
 //BA.debugLineNum = 4718601;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=4718602;
 //BA.debugLineNum = 4718602;BA.debugLine="Dim values(cur.ColumnCount) As String";
_values = new String[_cur.getColumnCount()];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=4718603;
 //BA.debugLineNum = 4718603;BA.debugLine="For col = 0 To cur.ColumnCount - 1";
{
final int step10 = 1;
final int limit10 = (int) (_cur.getColumnCount()-1);
_col = (int) (0) ;
for (;(step10 > 0 && _col <= limit10) || (step10 < 0 && _col >= limit10) ;_col = ((int)(0 + _col + step10))  ) {
RDebugUtils.currentLine=4718604;
 //BA.debugLineNum = 4718604;BA.debugLine="values(col) = cur.GetString2(col)";
_values[_col] = _cur.GetString2(_col);
 }
};
RDebugUtils.currentLine=4718606;
 //BA.debugLineNum = 4718606;BA.debugLine="table.Add(values)";
_table.Add((Object)(_values));
RDebugUtils.currentLine=4718607;
 //BA.debugLineNum = 4718607;BA.debugLine="If Limit > 0 AND table.Size >= Limit Then Exit";
if (_limit>0 && _table.getSize()>=_limit) { 
if (true) break;};
 }
;
RDebugUtils.currentLine=4718609;
 //BA.debugLineNum = 4718609;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=4718610;
 //BA.debugLineNum = 4718610;BA.debugLine="Return table";
if (true) return _table;
RDebugUtils.currentLine=4718611;
 //BA.debugLineNum = 4718611;BA.debugLine="End Sub";
return null;
}
public static String  _createtable(anywheresoftware.b4j.objects.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _fieldsandtypes,String _primarykey) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "createtable"))
	return (String) Debug.delegate(ba, "createtable", new Object[] {_sql,_tablename,_fieldsandtypes,_primarykey});
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
String _field = "";
String _ftype = "";
String _query = "";
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Public Sub CreateTable(SQL As SQL, TableName As St";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="sb.Append(\"(\")";
_sb.Append("(");
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="For i = 0 To FieldsAndTypes.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_fieldsandtypes.getSize()-1);
_i = (int) (0) ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="Dim field, ftype As String";
_field = "";
_ftype = "";
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="field = FieldsAndTypes.GetKeyAt(i)";
_field = BA.ObjectToString(_fieldsandtypes.GetKeyAt(_i));
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="ftype = FieldsAndTypes.GetValueAt(i)";
_ftype = BA.ObjectToString(_fieldsandtypes.GetValueAt(_i));
RDebugUtils.currentLine=4390920;
 //BA.debugLineNum = 4390920;BA.debugLine="If i > 0 Then sb.Append(\", \")";
if (_i>0) { 
_sb.Append(", ");};
RDebugUtils.currentLine=4390921;
 //BA.debugLineNum = 4390921;BA.debugLine="sb.Append(EscapeField(field)).Append(\" \").Append";
_sb.Append(_escapefield(_field)).Append(" ").Append(_ftype);
RDebugUtils.currentLine=4390922;
 //BA.debugLineNum = 4390922;BA.debugLine="If field = PrimaryKey Then sb.Append(\" PRIMARY K";
if ((_field).equals(_primarykey)) { 
_sb.Append(" PRIMARY KEY");};
 }
};
RDebugUtils.currentLine=4390924;
 //BA.debugLineNum = 4390924;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=4390925;
 //BA.debugLineNum = 4390925;BA.debugLine="Dim query As String";
_query = "";
RDebugUtils.currentLine=4390926;
 //BA.debugLineNum = 4390926;BA.debugLine="query = \"CREATE TABLE IF NOT EXISTS \" & EscapeFie";
_query = "CREATE TABLE IF NOT EXISTS "+_escapefield(_tablename)+" "+_sb.ToString();
RDebugUtils.currentLine=4390927;
 //BA.debugLineNum = 4390927;BA.debugLine="Log(\"CreateTable: \" & query)";
anywheresoftware.b4a.keywords.Common.Log("CreateTable: "+_query);
RDebugUtils.currentLine=4390928;
 //BA.debugLineNum = 4390928;BA.debugLine="SQL.ExecNonQuery(query)";
_sql.ExecNonQuery(_query);
RDebugUtils.currentLine=4390929;
 //BA.debugLineNum = 4390929;BA.debugLine="End Sub";
return "";
}
public static String  _escapefield(String _f) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "escapefield"))
	return (String) Debug.delegate(ba, "escapefield", new Object[] {_f});
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Private Sub EscapeField(f As String) As String";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="Return \"[\" & f & \"]\"";
if (true) return "["+_f+"]";
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="End Sub";
return "";
}
public static String  _deleterecord(anywheresoftware.b4j.objects.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "deleterecord"))
	return (String) Debug.delegate(ba, "deleterecord", new Object[] {_sql,_tablename,_wherefieldequals});
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _args = null;
int _i = 0;
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub DeleteRecord(SQL As SQL, TableName As S";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="sb.Append(\"DELETE FROM [\").Append(TableName).Ap";
_sb.Append("DELETE FROM [").Append(_tablename).Append("] WHERE ");
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
if (_wherefieldequals.getSize()==0) { 
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
anywheresoftware.b4a.keywords.Common.Log("WhereFieldEquals map empty!");
RDebugUtils.currentLine=5046278;
 //BA.debugLineNum = 5046278;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=5046280;
 //BA.debugLineNum = 5046280;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5046281;
 //BA.debugLineNum = 5046281;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=5046282;
 //BA.debugLineNum = 5046282;BA.debugLine="For i = 0 To WhereFieldEquals.Size - 1";
{
final int step10 = 1;
final int limit10 = (int) (_wherefieldequals.getSize()-1);
_i = (int) (0) ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
RDebugUtils.currentLine=5046283;
 //BA.debugLineNum = 5046283;BA.debugLine="If i > 0 Then sb.Append(\" AND \")";
if (_i>0) { 
_sb.Append(" AND ");};
RDebugUtils.currentLine=5046284;
 //BA.debugLineNum = 5046284;BA.debugLine="sb.Append(\"[\").Append(WhereFieldEquals.GetKe";
_sb.Append("[").Append(BA.ObjectToString(_wherefieldequals.GetKeyAt(_i))).Append("] = ?");
RDebugUtils.currentLine=5046285;
 //BA.debugLineNum = 5046285;BA.debugLine="args.Add(WhereFieldEquals.GetValueAt(i))";
_args.Add(_wherefieldequals.GetValueAt(_i));
 }
};
RDebugUtils.currentLine=5046288;
 //BA.debugLineNum = 5046288;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
_sql.ExecNonQuery2(_sb.ToString(),_args);
RDebugUtils.currentLine=5046289;
 //BA.debugLineNum = 5046289;BA.debugLine="End Sub";
return "";
}
public static String  _droptable(anywheresoftware.b4j.objects.SQL _sql,String _tablename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "droptable"))
	return (String) Debug.delegate(ba, "droptable", new Object[] {_sql,_tablename});
String _query = "";
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub DropTable(SQL As SQL, TableName As Stri";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="Dim query As String";
_query = "";
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="query = \"DROP TABLE IF EXISTS \" & EscapeField(Tab";
_query = "DROP TABLE IF EXISTS "+_escapefield(_tablename);
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="Log(\"DropTable3: \" & query)";
anywheresoftware.b4a.keywords.Common.Log("DropTable3: "+_query);
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="SQL.ExecNonQuery(query)";
_sql.ExecNonQuery(_query);
RDebugUtils.currentLine=4456453;
 //BA.debugLineNum = 4456453;BA.debugLine="End Sub";
return "";
}
public static String  _executehtml(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs,int _limit) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executehtml"))
	return (String) Debug.delegate(ba, "executehtml", new Object[] {_sql,_query,_stringargs,_limit});
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _row = 0;
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Public Sub ExecuteHtml(SQL As SQL, Query As String";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = _sql.ExecQuery2(_query,anywheresoftware.b4a.keywords.Common.ArrayToList(_stringargs));
 }else {
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = _sql.ExecQuery(_query);
 };
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="Log(\"ExecuteHtml: \" & Query)";
anywheresoftware.b4a.keywords.Common.Log("ExecuteHtml: "+_query);
RDebugUtils.currentLine=4980744;
 //BA.debugLineNum = 4980744;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=4980745;
 //BA.debugLineNum = 4980745;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=4980746;
 //BA.debugLineNum = 4980746;BA.debugLine="sb.Append(\"<html><body>\").Append(CRLF)";
_sb.Append("<html><body>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=4980747;
 //BA.debugLineNum = 4980747;BA.debugLine="sb.Append(\"<style type='text/css'>\").Append(HtmlC";
_sb.Append("<style type='text/css'>").Append(_htmlcss).Append("</style>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=4980748;
 //BA.debugLineNum = 4980748;BA.debugLine="sb.Append(\"<table><thead><tr>\").Append(CRLF)";
_sb.Append("<table><thead><tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=4980749;
 //BA.debugLineNum = 4980749;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step13 = 1;
final int limit13 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
RDebugUtils.currentLine=4980750;
 //BA.debugLineNum = 4980750;BA.debugLine="sb.Append(\"<th>\").Append(cur.GetColumnName(i)).A";
_sb.Append("<th>").Append(_cur.GetColumnName(_i)).Append("</th>");
 }
};
RDebugUtils.currentLine=4980752;
 //BA.debugLineNum = 4980752;BA.debugLine="sb.Append(\"</thead>\")";
_sb.Append("</thead>");
RDebugUtils.currentLine=4980762;
 //BA.debugLineNum = 4980762;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=4980763;
 //BA.debugLineNum = 4980763;BA.debugLine="Dim row As Int";
_row = 0;
RDebugUtils.currentLine=4980764;
 //BA.debugLineNum = 4980764;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=4980765;
 //BA.debugLineNum = 4980765;BA.debugLine="If row Mod 2 = 0 Then";
if (_row%2==0) { 
RDebugUtils.currentLine=4980766;
 //BA.debugLineNum = 4980766;BA.debugLine="sb.Append(\"<tr>\")";
_sb.Append("<tr>");
 }else {
RDebugUtils.currentLine=4980768;
 //BA.debugLineNum = 4980768;BA.debugLine="sb.Append(\"<tr class='odd'>\")";
_sb.Append("<tr class='odd'>");
 };
RDebugUtils.currentLine=4980770;
 //BA.debugLineNum = 4980770;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step25 = 1;
final int limit25 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;(step25 > 0 && _i <= limit25) || (step25 < 0 && _i >= limit25) ;_i = ((int)(0 + _i + step25))  ) {
RDebugUtils.currentLine=4980771;
 //BA.debugLineNum = 4980771;BA.debugLine="sb.Append(\"<td>\")";
_sb.Append("<td>");
RDebugUtils.currentLine=4980772;
 //BA.debugLineNum = 4980772;BA.debugLine="sb.Append(cur.GetString2(i))";
_sb.Append(_cur.GetString2(_i));
RDebugUtils.currentLine=4980773;
 //BA.debugLineNum = 4980773;BA.debugLine="sb.Append(\"</td>\")";
_sb.Append("</td>");
 }
};
RDebugUtils.currentLine=4980775;
 //BA.debugLineNum = 4980775;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=4980776;
 //BA.debugLineNum = 4980776;BA.debugLine="row = row + 1";
_row = (int) (_row+1);
 }
;
RDebugUtils.currentLine=4980778;
 //BA.debugLineNum = 4980778;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=4980779;
 //BA.debugLineNum = 4980779;BA.debugLine="sb.Append(\"</table></body></html>\")";
_sb.Append("</table></body></html>");
RDebugUtils.currentLine=4980780;
 //BA.debugLineNum = 4980780;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=4980781;
 //BA.debugLineNum = 4980781;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _executejson(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.collections.List _dbtypes) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executejson"))
	return (anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "executejson", new Object[] {_sql,_query,_stringargs,_limit,_dbtypes});
anywheresoftware.b4a.objects.collections.List _table = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cur = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _root = null;
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub ExecuteJSON (SQL As SQL, Query As Strin";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = _sql.ExecQuery2(_query,anywheresoftware.b4a.keywords.Common.ArrayToList(_stringargs));
 }else {
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = _sql.ExecQuery(_query);
 };
RDebugUtils.currentLine=4915208;
 //BA.debugLineNum = 4915208;BA.debugLine="Log(\"ExecuteJSON: \" & Query)";
anywheresoftware.b4a.keywords.Common.Log("ExecuteJSON: "+_query);
RDebugUtils.currentLine=4915209;
 //BA.debugLineNum = 4915209;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4915210;
 //BA.debugLineNum = 4915210;BA.debugLine="table.Initialize";
_table.Initialize();
RDebugUtils.currentLine=4915211;
 //BA.debugLineNum = 4915211;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=4915212;
 //BA.debugLineNum = 4915212;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4915213;
 //BA.debugLineNum = 4915213;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=4915214;
 //BA.debugLineNum = 4915214;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step14 = 1;
final int limit14 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;(step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14) ;_i = ((int)(0 + _i + step14))  ) {
RDebugUtils.currentLine=4915215;
 //BA.debugLineNum = 4915215;BA.debugLine="Select DBTypes.Get(i)";
switch (BA.switchObjectToInt(_dbtypes.Get(_i),(Object)(_db_text),(Object)(_db_integer),(Object)(_db_real))) {
case 0: {
RDebugUtils.currentLine=4915217;
 //BA.debugLineNum = 4915217;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetString2(i)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetString2(_i)));
 break; }
case 1: {
RDebugUtils.currentLine=4915219;
 //BA.debugLineNum = 4915219;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetLong2(i))";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetLong2(_i)));
 break; }
case 2: {
RDebugUtils.currentLine=4915221;
 //BA.debugLineNum = 4915221;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetDouble2(i)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetDouble2(_i)));
 break; }
default: {
RDebugUtils.currentLine=4915223;
 //BA.debugLineNum = 4915223;BA.debugLine="Log(\"Invalid type: \" & DBTypes.Get(i))";
anywheresoftware.b4a.keywords.Common.Log("Invalid type: "+BA.ObjectToString(_dbtypes.Get(_i)));
 break; }
}
;
 }
};
RDebugUtils.currentLine=4915226;
 //BA.debugLineNum = 4915226;BA.debugLine="table.Add(m)";
_table.Add((Object)(_m.getObject()));
RDebugUtils.currentLine=4915227;
 //BA.debugLineNum = 4915227;BA.debugLine="If Limit > 0 And m.Size >= Limit Then Exit";
if (_limit>0 && _m.getSize()>=_limit) { 
if (true) break;};
 }
;
RDebugUtils.currentLine=4915229;
 //BA.debugLineNum = 4915229;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=4915230;
 //BA.debugLineNum = 4915230;BA.debugLine="Dim root As Map";
_root = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4915231;
 //BA.debugLineNum = 4915231;BA.debugLine="root.Initialize";
_root.Initialize();
RDebugUtils.currentLine=4915232;
 //BA.debugLineNum = 4915232;BA.debugLine="root.Put(\"root\", table)";
_root.Put((Object)("root"),(Object)(_table.getObject()));
RDebugUtils.currentLine=4915233;
 //BA.debugLineNum = 4915233;BA.debugLine="Return root";
if (true) return _root;
RDebugUtils.currentLine=4915234;
 //BA.debugLineNum = 4915234;BA.debugLine="End Sub";
return null;
}
public static String  _executelist(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.collections.List _list1) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executelist"))
	return (String) Debug.delegate(ba, "executelist", new Object[] {_sql,_query,_stringargs,_limit,_list1});
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _cols = null;
int _i = 0;
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub ExecuteList(SQL As SQL, Query As String";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="List1.Clear";
_list1.Clear();
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="Dim Table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
_table = _executememorytable(_sql,_query,_stringargs,_limit);
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="If Table.Size = 0 Then Return";
if (_table.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="Dim Cols() As String";
_cols = new String[(int) (0)];
java.util.Arrays.fill(_cols,"");
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="For i = 0 To Table.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_table.getSize()-1);
_i = (int) (0) ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
RDebugUtils.currentLine=4849671;
 //BA.debugLineNum = 4849671;BA.debugLine="Cols = Table.Get(i)";
_cols = (String[])(_table.Get(_i));
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="List1.Add(Cols(0))";
_list1.Add((Object)(_cols[(int) (0)]));
 }
};
RDebugUtils.currentLine=4849674;
 //BA.debugLineNum = 4849674;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _executemap(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executemap"))
	return (anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "executemap", new Object[] {_sql,_query,_stringargs});
anywheresoftware.b4a.objects.collections.Map _res = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cur = null;
int _i = 0;
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub ExecuteMap(SQL As SQL, Query As String,";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Dim res As Map";
_res = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = _sql.ExecQuery2(_query,anywheresoftware.b4a.keywords.Common.ArrayToList(_stringargs));
 }else {
RDebugUtils.currentLine=4784134;
 //BA.debugLineNum = 4784134;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = _sql.ExecQuery(_query);
 };
RDebugUtils.currentLine=4784137;
 //BA.debugLineNum = 4784137;BA.debugLine="If cur.NextRow = False Then";
if (_cur.NextRow()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=4784138;
 //BA.debugLineNum = 4784138;BA.debugLine="Log(\"No records found.\")";
anywheresoftware.b4a.keywords.Common.Log("No records found.");
RDebugUtils.currentLine=4784139;
 //BA.debugLineNum = 4784139;BA.debugLine="Return res";
if (true) return _res;
 };
RDebugUtils.currentLine=4784141;
 //BA.debugLineNum = 4784141;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=4784142;
 //BA.debugLineNum = 4784142;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step13 = 1;
final int limit13 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
RDebugUtils.currentLine=4784143;
 //BA.debugLineNum = 4784143;BA.debugLine="res.Put(cur.GetColumnName(i).ToLowerCase, cur.Ge";
_res.Put((Object)(_cur.GetColumnName(_i).toLowerCase()),(Object)(_cur.GetString2(_i)));
 }
};
RDebugUtils.currentLine=4784145;
 //BA.debugLineNum = 4784145;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=4784146;
 //BA.debugLineNum = 4784146;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=4784147;
 //BA.debugLineNum = 4784147;BA.debugLine="End Sub";
return null;
}
public static String  _filltable(anywheresoftware.b4j.object.WebSocket _ws,anywheresoftware.b4j.object.WebSocket.JQueryElement _jq,anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "filltable"))
	return (String) Debug.delegate(ba, "filltable", new Object[] {_ws,_jq,_rs});
anywheresoftware.b4a.objects.collections.List _data = null;
anywheresoftware.b4a.objects.collections.List _row = null;
int _c = 0;
String _val = "";
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub FillTable(ws As WebSocket, jq As JQuery";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Dim data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="Dim row As List";
_row = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5111813;
 //BA.debugLineNum = 5111813;BA.debugLine="row.Initialize";
_row.Initialize();
RDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="For c = 0 To rs.ColumnCount - 1";
{
final int step6 = 1;
final int limit6 = (int) (_rs.getColumnCount()-1);
_c = (int) (0) ;
for (;(step6 > 0 && _c <= limit6) || (step6 < 0 && _c >= limit6) ;_c = ((int)(0 + _c + step6))  ) {
RDebugUtils.currentLine=5111815;
 //BA.debugLineNum = 5111815;BA.debugLine="Dim val As String = rs.GetString2(c)";
_val = _rs.GetString2(_c);
RDebugUtils.currentLine=5111816;
 //BA.debugLineNum = 5111816;BA.debugLine="row.Add($\"$Xml{val}\"$)";
_row.Add((Object)((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_val))+"")));
 }
};
RDebugUtils.currentLine=5111818;
 //BA.debugLineNum = 5111818;BA.debugLine="data.Add(row)";
_data.Add((Object)(_row.getObject()));
 }
;
RDebugUtils.currentLine=5111820;
 //BA.debugLineNum = 5111820;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=5111821;
 //BA.debugLineNum = 5111821;BA.debugLine="ws.Eval(\"$(arguments[0]).dataTable().fnClearTable";
_ws.Eval("$(arguments[0]).dataTable().fnClearTable()",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_jq.getId())}));
RDebugUtils.currentLine=5111822;
 //BA.debugLineNum = 5111822;BA.debugLine="ws.Eval(\"$(arguments[0]).dataTable().fnAddData(ar";
_ws.Eval("$(arguments[0]).dataTable().fnAddData(arguments[1])",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_jq.getId()),(Object)(_data.getObject())}));
RDebugUtils.currentLine=5111823;
 //BA.debugLineNum = 5111823;BA.debugLine="End Sub";
return "";
}
public static String  _insertmaps(anywheresoftware.b4j.objects.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.List _listofmaps) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "insertmaps"))
	return (String) Debug.delegate(ba, "insertmaps", new Object[] {_sql,_tablename,_listofmaps});
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
int _i1 = 0;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
int _i2 = 0;
String _col = "";
Object _value = null;
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub InsertMaps(SQL As SQL, TableName As Str";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="Dim sb, columns, values As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = Li";
if (_listofmaps.getSize()>1 && (_listofmaps.Get((int) (0))).equals(_listofmaps.Get((int) (1)))) { 
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="Log(\"Same Map found twice in list. Each item in";
anywheresoftware.b4a.keywords.Common.Log("Same Map found twice in list. Each item in the list should include a different map object.");
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4521991;
 //BA.debugLineNum = 4521991;BA.debugLine="SQL.BeginTransaction";
_sql.BeginTransaction();
RDebugUtils.currentLine=4521992;
 //BA.debugLineNum = 4521992;BA.debugLine="Try";
try {RDebugUtils.currentLine=4521993;
 //BA.debugLineNum = 4521993;BA.debugLine="For i1 = 0 To ListOfMaps.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_listofmaps.getSize()-1);
_i1 = (int) (0) ;
for (;(step8 > 0 && _i1 <= limit8) || (step8 < 0 && _i1 >= limit8) ;_i1 = ((int)(0 + _i1 + step8))  ) {
RDebugUtils.currentLine=4521994;
 //BA.debugLineNum = 4521994;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=4521995;
 //BA.debugLineNum = 4521995;BA.debugLine="columns.Initialize";
_columns.Initialize();
RDebugUtils.currentLine=4521996;
 //BA.debugLineNum = 4521996;BA.debugLine="values.Initialize";
_values.Initialize();
RDebugUtils.currentLine=4521997;
 //BA.debugLineNum = 4521997;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4521998;
 //BA.debugLineNum = 4521998;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
RDebugUtils.currentLine=4521999;
 //BA.debugLineNum = 4521999;BA.debugLine="sb.Append(\"INSERT INTO [\" & TableName & \"] (\")";
_sb.Append("INSERT INTO ["+_tablename+"] (");
RDebugUtils.currentLine=4522000;
 //BA.debugLineNum = 4522000;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4522001;
 //BA.debugLineNum = 4522001;BA.debugLine="m = ListOfMaps.Get(i1)";
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_listofmaps.Get(_i1)));
RDebugUtils.currentLine=4522002;
 //BA.debugLineNum = 4522002;BA.debugLine="For i2 = 0 To m.Size - 1";
{
final int step17 = 1;
final int limit17 = (int) (_m.getSize()-1);
_i2 = (int) (0) ;
for (;(step17 > 0 && _i2 <= limit17) || (step17 < 0 && _i2 >= limit17) ;_i2 = ((int)(0 + _i2 + step17))  ) {
RDebugUtils.currentLine=4522003;
 //BA.debugLineNum = 4522003;BA.debugLine="Dim col As String";
_col = "";
RDebugUtils.currentLine=4522004;
 //BA.debugLineNum = 4522004;BA.debugLine="Dim value As Object";
_value = new Object();
RDebugUtils.currentLine=4522005;
 //BA.debugLineNum = 4522005;BA.debugLine="col = m.GetKeyAt(i2)";
_col = BA.ObjectToString(_m.GetKeyAt(_i2));
RDebugUtils.currentLine=4522006;
 //BA.debugLineNum = 4522006;BA.debugLine="value = m.GetValueAt(i2)";
_value = _m.GetValueAt(_i2);
RDebugUtils.currentLine=4522007;
 //BA.debugLineNum = 4522007;BA.debugLine="If i2 > 0 Then";
if (_i2>0) { 
RDebugUtils.currentLine=4522008;
 //BA.debugLineNum = 4522008;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
RDebugUtils.currentLine=4522009;
 //BA.debugLineNum = 4522009;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
RDebugUtils.currentLine=4522011;
 //BA.debugLineNum = 4522011;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(_escapefield(_col));
RDebugUtils.currentLine=4522013;
 //BA.debugLineNum = 4522013;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
RDebugUtils.currentLine=4522014;
 //BA.debugLineNum = 4522014;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add(_value);
 }
};
RDebugUtils.currentLine=4522016;
 //BA.debugLineNum = 4522016;BA.debugLine="sb.Append(columns.ToString)";
_sb.Append(_columns.ToString());
RDebugUtils.currentLine=4522017;
 //BA.debugLineNum = 4522017;BA.debugLine="sb.Append(\") VALUES (\")";
_sb.Append(") VALUES (");
RDebugUtils.currentLine=4522018;
 //BA.debugLineNum = 4522018;BA.debugLine="sb.Append(values.ToString)";
_sb.Append(_values.ToString());
RDebugUtils.currentLine=4522019;
 //BA.debugLineNum = 4522019;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=4522021;
 //BA.debugLineNum = 4522021;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, listOfValues)";
_sql.ExecNonQuery2(_sb.ToString(),_listofvalues);
 }
};
RDebugUtils.currentLine=4522023;
 //BA.debugLineNum = 4522023;BA.debugLine="SQL.TransactionSuccessful";
_sql.TransactionSuccessful();
 } 
       catch (Exception e38) {
			ba.setLastException(e38);RDebugUtils.currentLine=4522025;
 //BA.debugLineNum = 4522025;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=4522026;
 //BA.debugLineNum = 4522026;BA.debugLine="SQL.Rollback";
_sql.Rollback();
 };
RDebugUtils.currentLine=4522028;
 //BA.debugLineNum = 4522028;BA.debugLine="End Sub";
return "";
}
public static String  _updaterecord(anywheresoftware.b4j.objects.SQL _sql,String _tablename,String _field,Object _newvalue,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "updaterecord"))
	return (String) Debug.delegate(ba, "updaterecord", new Object[] {_sql,_tablename,_field,_newvalue,_wherefieldequals});
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _args = null;
int _i = 0;
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Public Sub UpdateRecord(SQL As SQL, TableName As S";
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="sb.Append(\"UPDATE \").Append(EscapeField(TableName";
_sb.Append("UPDATE ").Append(_escapefield(_tablename)).Append(" SET ").Append(_escapefield(_field)).Append(" = ? WHERE ");
RDebugUtils.currentLine=4587526;
 //BA.debugLineNum = 4587526;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
if (_wherefieldequals.getSize()==0) { 
RDebugUtils.currentLine=4587527;
 //BA.debugLineNum = 4587527;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
anywheresoftware.b4a.keywords.Common.Log("WhereFieldEquals map empty!");
RDebugUtils.currentLine=4587528;
 //BA.debugLineNum = 4587528;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4587530;
 //BA.debugLineNum = 4587530;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4587531;
 //BA.debugLineNum = 4587531;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=4587532;
 //BA.debugLineNum = 4587532;BA.debugLine="args.Add(NewValue)";
_args.Add(_newvalue);
RDebugUtils.currentLine=4587533;
 //BA.debugLineNum = 4587533;BA.debugLine="For i = 0 To WhereFieldEquals.Size - 1";
{
final int step11 = 1;
final int limit11 = (int) (_wherefieldequals.getSize()-1);
_i = (int) (0) ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
RDebugUtils.currentLine=4587534;
 //BA.debugLineNum = 4587534;BA.debugLine="If i > 0 Then sb.Append(\" AND \")";
if (_i>0) { 
_sb.Append(" AND ");};
RDebugUtils.currentLine=4587535;
 //BA.debugLineNum = 4587535;BA.debugLine="sb.Append(EscapeField(WhereFieldEquals.GetKeyAt(";
_sb.Append(_escapefield(BA.ObjectToString(_wherefieldequals.GetKeyAt(_i)))).Append(" = ?");
RDebugUtils.currentLine=4587536;
 //BA.debugLineNum = 4587536;BA.debugLine="args.Add(WhereFieldEquals.GetValueAt(i))";
_args.Add(_wherefieldequals.GetValueAt(_i));
 }
};
RDebugUtils.currentLine=4587539;
 //BA.debugLineNum = 4587539;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
_sql.ExecNonQuery2(_sb.ToString(),_args);
RDebugUtils.currentLine=4587540;
 //BA.debugLineNum = 4587540;BA.debugLine="End Sub";
return "";
}
public static String  _updaterecord2(anywheresoftware.b4j.objects.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _fields,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "updaterecord2"))
	return (String) Debug.delegate(ba, "updaterecord2", new Object[] {_sql,_tablename,_fields,_wherefieldequals});
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _args = null;
int _i = 0;
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Public Sub UpdateRecord2(SQL As SQL, TableName As";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
if (_wherefieldequals.getSize()==0) { 
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
anywheresoftware.b4a.keywords.Common.Log("WhereFieldEquals map empty!");
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="If Fields.Size = 0 Then";
if (_fields.getSize()==0) { 
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="Log(\"Fields empty\")";
anywheresoftware.b4a.keywords.Common.Log("Fields empty");
RDebugUtils.currentLine=4653063;
 //BA.debugLineNum = 4653063;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4653065;
 //BA.debugLineNum = 4653065;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=4653066;
 //BA.debugLineNum = 4653066;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=4653067;
 //BA.debugLineNum = 4653067;BA.debugLine="sb.Append(\"UPDATE \").Append(EscapeField(TableName";
_sb.Append("UPDATE ").Append(_escapefield(_tablename)).Append(" SET ");
RDebugUtils.currentLine=4653068;
 //BA.debugLineNum = 4653068;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4653069;
 //BA.debugLineNum = 4653069;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=4653070;
 //BA.debugLineNum = 4653070;BA.debugLine="For i=0 To Fields.Size-1";
{
final int step14 = 1;
final int limit14 = (int) (_fields.getSize()-1);
_i = (int) (0) ;
for (;(step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14) ;_i = ((int)(0 + _i + step14))  ) {
RDebugUtils.currentLine=4653071;
 //BA.debugLineNum = 4653071;BA.debugLine="If i<>Fields.Size-1 Then";
if (_i!=_fields.getSize()-1) { 
RDebugUtils.currentLine=4653072;
 //BA.debugLineNum = 4653072;BA.debugLine="sb.Append(EscapeField(Fields.GetKeyAt(i))).Appe";
_sb.Append(_escapefield(BA.ObjectToString(_fields.GetKeyAt(_i)))).Append("=?,");
 }else {
RDebugUtils.currentLine=4653074;
 //BA.debugLineNum = 4653074;BA.debugLine="sb.Append(EscapeField(Fields.GetKeyAt(i))).Appe";
_sb.Append(_escapefield(BA.ObjectToString(_fields.GetKeyAt(_i)))).Append("=?");
 };
RDebugUtils.currentLine=4653076;
 //BA.debugLineNum = 4653076;BA.debugLine="args.Add(Fields.GetValueAt(i))";
_args.Add(_fields.GetValueAt(_i));
 }
};
RDebugUtils.currentLine=4653079;
 //BA.debugLineNum = 4653079;BA.debugLine="sb.Append(\" WHERE \")";
_sb.Append(" WHERE ");
RDebugUtils.currentLine=4653080;
 //BA.debugLineNum = 4653080;BA.debugLine="For i = 0 To WhereFieldEquals.Size - 1";
{
final int step23 = 1;
final int limit23 = (int) (_wherefieldequals.getSize()-1);
_i = (int) (0) ;
for (;(step23 > 0 && _i <= limit23) || (step23 < 0 && _i >= limit23) ;_i = ((int)(0 + _i + step23))  ) {
RDebugUtils.currentLine=4653081;
 //BA.debugLineNum = 4653081;BA.debugLine="If i > 0 Then";
if (_i>0) { 
RDebugUtils.currentLine=4653082;
 //BA.debugLineNum = 4653082;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
RDebugUtils.currentLine=4653084;
 //BA.debugLineNum = 4653084;BA.debugLine="sb.Append(EscapeField(WhereFieldEquals.GetKeyAt(";
_sb.Append(_escapefield(BA.ObjectToString(_wherefieldequals.GetKeyAt(_i)))).Append(" = ?");
RDebugUtils.currentLine=4653085;
 //BA.debugLineNum = 4653085;BA.debugLine="args.Add(WhereFieldEquals.GetValueAt(i))";
_args.Add(_wherefieldequals.GetValueAt(_i));
 }
};
RDebugUtils.currentLine=4653088;
 //BA.debugLineNum = 4653088;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
_sql.ExecNonQuery2(_sb.ToString(),_args);
RDebugUtils.currentLine=4653089;
 //BA.debugLineNum = 4653089;BA.debugLine="End Sub";
return "";
}
}