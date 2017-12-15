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
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub ExecuteMemoryTable(SQL As SQL, Query As";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="If StringArgs = Null Then";
if (_stringargs== null) { 
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="Dim StringArgs(0) As String";
_stringargs = new String[(int) (0)];
java.util.Arrays.fill(_stringargs,"");
 };
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = _sql.ExecQuery2(_query,anywheresoftware.b4a.keywords.Common.ArrayToList(_stringargs));
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="table.Initialize";
_table.Initialize();
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="Dim values(cur.ColumnCount) As String";
_values = new String[_cur.getColumnCount()];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="For col = 0 To cur.ColumnCount - 1";
{
final int step10 = 1;
final int limit10 = (int) (_cur.getColumnCount()-1);
_col = (int) (0) ;
for (;(step10 > 0 && _col <= limit10) || (step10 < 0 && _col >= limit10) ;_col = ((int)(0 + _col + step10))  ) {
RDebugUtils.currentLine=1114124;
 //BA.debugLineNum = 1114124;BA.debugLine="values(col) = cur.GetString2(col)";
_values[_col] = _cur.GetString2(_col);
 }
};
RDebugUtils.currentLine=1114126;
 //BA.debugLineNum = 1114126;BA.debugLine="table.Add(values)";
_table.Add((Object)(_values));
RDebugUtils.currentLine=1114127;
 //BA.debugLineNum = 1114127;BA.debugLine="If Limit > 0 And table.Size >= Limit Then Exit";
if (_limit>0 && _table.getSize()>=_limit) { 
if (true) break;};
 }
;
RDebugUtils.currentLine=1114129;
 //BA.debugLineNum = 1114129;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=1114130;
 //BA.debugLineNum = 1114130;BA.debugLine="Return table";
if (true) return _table;
RDebugUtils.currentLine=1114131;
 //BA.debugLineNum = 1114131;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub CreateTable(SQL As SQL, TableName As St";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="sb.Append(\"(\")";
_sb.Append("(");
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="For i = 0 To FieldsAndTypes.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_fieldsandtypes.getSize()-1);
_i = (int) (0) ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="Dim field, ftype As String";
_field = "";
_ftype = "";
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="field = FieldsAndTypes.GetKeyAt(i)";
_field = BA.ObjectToString(_fieldsandtypes.GetKeyAt(_i));
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="ftype = FieldsAndTypes.GetValueAt(i)";
_ftype = BA.ObjectToString(_fieldsandtypes.GetValueAt(_i));
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="If i > 0 Then sb.Append(\", \")";
if (_i>0) { 
_sb.Append(", ");};
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="sb.Append(EscapeField(field)).Append(\" \").Append";
_sb.Append(_escapefield(_field)).Append(" ").Append(_ftype);
RDebugUtils.currentLine=786442;
 //BA.debugLineNum = 786442;BA.debugLine="If field = PrimaryKey Then sb.Append(\" PRIMARY K";
if ((_field).equals(_primarykey)) { 
_sb.Append(" PRIMARY KEY");};
 }
};
RDebugUtils.currentLine=786444;
 //BA.debugLineNum = 786444;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=786445;
 //BA.debugLineNum = 786445;BA.debugLine="Dim query As String";
_query = "";
RDebugUtils.currentLine=786446;
 //BA.debugLineNum = 786446;BA.debugLine="query = \"CREATE TABLE IF NOT EXISTS \" & EscapeFie";
_query = "CREATE TABLE IF NOT EXISTS "+_escapefield(_tablename)+" "+_sb.ToString();
RDebugUtils.currentLine=786447;
 //BA.debugLineNum = 786447;BA.debugLine="Log(\"CreateTable: \" & query)";
anywheresoftware.b4a.keywords.Common.Log("CreateTable: "+_query);
RDebugUtils.currentLine=786448;
 //BA.debugLineNum = 786448;BA.debugLine="SQL.ExecNonQuery(query)";
_sql.ExecNonQuery(_query);
RDebugUtils.currentLine=786449;
 //BA.debugLineNum = 786449;BA.debugLine="End Sub";
return "";
}
public static String  _escapefield(String _f) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "escapefield"))
	return (String) Debug.delegate(ba, "escapefield", new Object[] {_f});
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub EscapeField(f As String) As String";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Return \"[\" & f & \"]\"";
if (true) return "["+_f+"]";
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return "";
}
public static String  _deleterecord(anywheresoftware.b4j.objects.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "deleterecord"))
	return (String) Debug.delegate(ba, "deleterecord", new Object[] {_sql,_tablename,_wherefieldequals});
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _args = null;
int _i = 0;
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub DeleteRecord(SQL As SQL, TableName As S";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="sb.Append(\"DELETE FROM [\").Append(TableName).Ap";
_sb.Append("DELETE FROM [").Append(_tablename).Append("] WHERE ");
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
if (_wherefieldequals.getSize()==0) { 
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
anywheresoftware.b4a.keywords.Common.Log("WhereFieldEquals map empty!");
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=1441802;
 //BA.debugLineNum = 1441802;BA.debugLine="For i = 0 To WhereFieldEquals.Size - 1";
{
final int step10 = 1;
final int limit10 = (int) (_wherefieldequals.getSize()-1);
_i = (int) (0) ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
RDebugUtils.currentLine=1441803;
 //BA.debugLineNum = 1441803;BA.debugLine="If i > 0 Then sb.Append(\" AND \")";
if (_i>0) { 
_sb.Append(" AND ");};
RDebugUtils.currentLine=1441804;
 //BA.debugLineNum = 1441804;BA.debugLine="sb.Append(\"[\").Append(WhereFieldEquals.GetKe";
_sb.Append("[").Append(BA.ObjectToString(_wherefieldequals.GetKeyAt(_i))).Append("] = ?");
RDebugUtils.currentLine=1441805;
 //BA.debugLineNum = 1441805;BA.debugLine="args.Add(WhereFieldEquals.GetValueAt(i))";
_args.Add(_wherefieldequals.GetValueAt(_i));
 }
};
RDebugUtils.currentLine=1441808;
 //BA.debugLineNum = 1441808;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
_sql.ExecNonQuery2(_sb.ToString(),_args);
RDebugUtils.currentLine=1441809;
 //BA.debugLineNum = 1441809;BA.debugLine="End Sub";
return "";
}
public static String  _droptable(anywheresoftware.b4j.objects.SQL _sql,String _tablename) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "droptable"))
	return (String) Debug.delegate(ba, "droptable", new Object[] {_sql,_tablename});
String _query = "";
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub DropTable(SQL As SQL, TableName As Stri";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Dim query As String";
_query = "";
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="query = \"DROP TABLE IF EXISTS \" & EscapeField(Tab";
_query = "DROP TABLE IF EXISTS "+_escapefield(_tablename);
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Log(\"DropTable3: \" & query)";
anywheresoftware.b4a.keywords.Common.Log("DropTable3: "+_query);
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="SQL.ExecNonQuery(query)";
_sql.ExecNonQuery(_query);
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub ExecuteHtml(SQL As SQL, Query As String";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = _sql.ExecQuery2(_query,anywheresoftware.b4a.keywords.Common.ArrayToList(_stringargs));
 }else {
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = _sql.ExecQuery(_query);
 };
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="Log(\"ExecuteHtml: \" & Query)";
anywheresoftware.b4a.keywords.Common.Log("ExecuteHtml: "+_query);
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="sb.Append(\"<html><body>\").Append(CRLF)";
_sb.Append("<html><body>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=1376267;
 //BA.debugLineNum = 1376267;BA.debugLine="sb.Append(\"<style type='text/css'>\").Append(HtmlC";
_sb.Append("<style type='text/css'>").Append(_htmlcss).Append("</style>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=1376268;
 //BA.debugLineNum = 1376268;BA.debugLine="sb.Append(\"<table><thead><tr>\").Append(CRLF)";
_sb.Append("<table><thead><tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=1376269;
 //BA.debugLineNum = 1376269;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step13 = 1;
final int limit13 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
RDebugUtils.currentLine=1376270;
 //BA.debugLineNum = 1376270;BA.debugLine="sb.Append(\"<th>\").Append(cur.GetColumnName(i)).A";
_sb.Append("<th>").Append(_cur.GetColumnName(_i)).Append("</th>");
 }
};
RDebugUtils.currentLine=1376272;
 //BA.debugLineNum = 1376272;BA.debugLine="sb.Append(\"</thead>\")";
_sb.Append("</thead>");
RDebugUtils.currentLine=1376282;
 //BA.debugLineNum = 1376282;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=1376283;
 //BA.debugLineNum = 1376283;BA.debugLine="Dim row As Int";
_row = 0;
RDebugUtils.currentLine=1376284;
 //BA.debugLineNum = 1376284;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=1376285;
 //BA.debugLineNum = 1376285;BA.debugLine="If row Mod 2 = 0 Then";
if (_row%2==0) { 
RDebugUtils.currentLine=1376286;
 //BA.debugLineNum = 1376286;BA.debugLine="sb.Append(\"<tr>\")";
_sb.Append("<tr>");
 }else {
RDebugUtils.currentLine=1376288;
 //BA.debugLineNum = 1376288;BA.debugLine="sb.Append(\"<tr class='odd'>\")";
_sb.Append("<tr class='odd'>");
 };
RDebugUtils.currentLine=1376290;
 //BA.debugLineNum = 1376290;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step25 = 1;
final int limit25 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;(step25 > 0 && _i <= limit25) || (step25 < 0 && _i >= limit25) ;_i = ((int)(0 + _i + step25))  ) {
RDebugUtils.currentLine=1376291;
 //BA.debugLineNum = 1376291;BA.debugLine="sb.Append(\"<td>\")";
_sb.Append("<td>");
RDebugUtils.currentLine=1376292;
 //BA.debugLineNum = 1376292;BA.debugLine="sb.Append(cur.GetString2(i))";
_sb.Append(_cur.GetString2(_i));
RDebugUtils.currentLine=1376293;
 //BA.debugLineNum = 1376293;BA.debugLine="sb.Append(\"</td>\")";
_sb.Append("</td>");
 }
};
RDebugUtils.currentLine=1376295;
 //BA.debugLineNum = 1376295;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
_sb.Append("</tr>").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=1376296;
 //BA.debugLineNum = 1376296;BA.debugLine="row = row + 1";
_row = (int) (_row+1);
 }
;
RDebugUtils.currentLine=1376298;
 //BA.debugLineNum = 1376298;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=1376299;
 //BA.debugLineNum = 1376299;BA.debugLine="sb.Append(\"</table></body></html>\")";
_sb.Append("</table></body></html>");
RDebugUtils.currentLine=1376300;
 //BA.debugLineNum = 1376300;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=1376301;
 //BA.debugLineNum = 1376301;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub ExecuteJSON (SQL As SQL, Query As Strin";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = _sql.ExecQuery2(_query,anywheresoftware.b4a.keywords.Common.ArrayToList(_stringargs));
 }else {
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = _sql.ExecQuery(_query);
 };
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="Log(\"ExecuteJSON: \" & Query)";
anywheresoftware.b4a.keywords.Common.Log("ExecuteJSON: "+_query);
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="Dim table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="table.Initialize";
_table.Initialize();
RDebugUtils.currentLine=1310731;
 //BA.debugLineNum = 1310731;BA.debugLine="Do While cur.NextRow";
while (_cur.NextRow()) {
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1310733;
 //BA.debugLineNum = 1310733;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=1310734;
 //BA.debugLineNum = 1310734;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step14 = 1;
final int limit14 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;(step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14) ;_i = ((int)(0 + _i + step14))  ) {
RDebugUtils.currentLine=1310735;
 //BA.debugLineNum = 1310735;BA.debugLine="Select DBTypes.Get(i)";
switch (BA.switchObjectToInt(_dbtypes.Get(_i),(Object)(_db_text),(Object)(_db_integer),(Object)(_db_real))) {
case 0: {
RDebugUtils.currentLine=1310737;
 //BA.debugLineNum = 1310737;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetString2(i)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetString2(_i)));
 break; }
case 1: {
RDebugUtils.currentLine=1310739;
 //BA.debugLineNum = 1310739;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetLong2(i))";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetLong2(_i)));
 break; }
case 2: {
RDebugUtils.currentLine=1310741;
 //BA.debugLineNum = 1310741;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetDouble2(i)";
_m.Put((Object)(_cur.GetColumnName(_i)),(Object)(_cur.GetDouble2(_i)));
 break; }
default: {
RDebugUtils.currentLine=1310743;
 //BA.debugLineNum = 1310743;BA.debugLine="Log(\"Invalid type: \" & DBTypes.Get(i))";
anywheresoftware.b4a.keywords.Common.Log("Invalid type: "+BA.ObjectToString(_dbtypes.Get(_i)));
 break; }
}
;
 }
};
RDebugUtils.currentLine=1310746;
 //BA.debugLineNum = 1310746;BA.debugLine="table.Add(m)";
_table.Add((Object)(_m.getObject()));
RDebugUtils.currentLine=1310747;
 //BA.debugLineNum = 1310747;BA.debugLine="If Limit > 0 And m.Size >= Limit Then Exit";
if (_limit>0 && _m.getSize()>=_limit) { 
if (true) break;};
 }
;
RDebugUtils.currentLine=1310749;
 //BA.debugLineNum = 1310749;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=1310750;
 //BA.debugLineNum = 1310750;BA.debugLine="Dim root As Map";
_root = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1310751;
 //BA.debugLineNum = 1310751;BA.debugLine="root.Initialize";
_root.Initialize();
RDebugUtils.currentLine=1310752;
 //BA.debugLineNum = 1310752;BA.debugLine="root.Put(\"root\", table)";
_root.Put((Object)("root"),(Object)(_table.getObject()));
RDebugUtils.currentLine=1310753;
 //BA.debugLineNum = 1310753;BA.debugLine="Return root";
if (true) return _root;
RDebugUtils.currentLine=1310754;
 //BA.debugLineNum = 1310754;BA.debugLine="End Sub";
return null;
}
public static String  _executelist(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs,int _limit,anywheresoftware.b4a.objects.collections.List _list1) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executelist"))
	return (String) Debug.delegate(ba, "executelist", new Object[] {_sql,_query,_stringargs,_limit,_list1});
anywheresoftware.b4a.objects.collections.List _table = null;
String[] _cols = null;
int _i = 0;
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub ExecuteList(SQL As SQL, Query As String";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="List1.Clear";
_list1.Clear();
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Dim Table As List";
_table = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
_table = _executememorytable(_sql,_query,_stringargs,_limit);
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="If Table.Size = 0 Then Return";
if (_table.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="Dim Cols() As String";
_cols = new String[(int) (0)];
java.util.Arrays.fill(_cols,"");
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="For i = 0 To Table.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_table.getSize()-1);
_i = (int) (0) ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="Cols = Table.Get(i)";
_cols = (String[])(_table.Get(_i));
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="List1.Add(Cols(0))";
_list1.Add((Object)(_cols[(int) (0)]));
 }
};
RDebugUtils.currentLine=1245194;
 //BA.debugLineNum = 1245194;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _executemap(anywheresoftware.b4j.objects.SQL _sql,String _query,String[] _stringargs) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "executemap"))
	return (anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "executemap", new Object[] {_sql,_query,_stringargs});
anywheresoftware.b4a.objects.collections.Map _res = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _cur = null;
int _i = 0;
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub ExecuteMap(SQL As SQL, Query As String,";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Dim res As Map";
_res = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Dim cur As ResultSet";
_cur = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="If StringArgs <> Null Then";
if (_stringargs!= null) { 
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
_cur = _sql.ExecQuery2(_query,anywheresoftware.b4a.keywords.Common.ArrayToList(_stringargs));
 }else {
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="cur = SQL.ExecQuery(Query)";
_cur = _sql.ExecQuery(_query);
 };
RDebugUtils.currentLine=1179657;
 //BA.debugLineNum = 1179657;BA.debugLine="If cur.NextRow = False Then";
if (_cur.NextRow()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="Log(\"No records found.\")";
anywheresoftware.b4a.keywords.Common.Log("No records found.");
RDebugUtils.currentLine=1179659;
 //BA.debugLineNum = 1179659;BA.debugLine="Return res";
if (true) return _res;
 };
RDebugUtils.currentLine=1179661;
 //BA.debugLineNum = 1179661;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=1179662;
 //BA.debugLineNum = 1179662;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
{
final int step13 = 1;
final int limit13 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
RDebugUtils.currentLine=1179663;
 //BA.debugLineNum = 1179663;BA.debugLine="res.Put(cur.GetColumnName(i).ToLowerCase, cur.Ge";
_res.Put((Object)(_cur.GetColumnName(_i).toLowerCase()),(Object)(_cur.GetString2(_i)));
 }
};
RDebugUtils.currentLine=1179665;
 //BA.debugLineNum = 1179665;BA.debugLine="cur.Close";
_cur.Close();
RDebugUtils.currentLine=1179666;
 //BA.debugLineNum = 1179666;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=1179667;
 //BA.debugLineNum = 1179667;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub FillTable(ws As WebSocket, jq As JQuery";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Dim data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="Dim row As List";
_row = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="row.Initialize";
_row.Initialize();
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="For c = 0 To rs.ColumnCount - 1";
{
final int step6 = 1;
final int limit6 = (int) (_rs.getColumnCount()-1);
_c = (int) (0) ;
for (;(step6 > 0 && _c <= limit6) || (step6 < 0 && _c >= limit6) ;_c = ((int)(0 + _c + step6))  ) {
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="Dim val As String = rs.GetString2(c)";
_val = _rs.GetString2(_c);
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="row.Add($\"$Xml{val}\"$)";
_row.Add((Object)((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("xml",(Object)(_val))+"")));
 }
};
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="data.Add(row)";
_data.Add((Object)(_row.getObject()));
 }
;
RDebugUtils.currentLine=1507340;
 //BA.debugLineNum = 1507340;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=1507341;
 //BA.debugLineNum = 1507341;BA.debugLine="ws.Eval(\"$(arguments[0]).dataTable().fnClearTable";
_ws.Eval("$(arguments[0]).dataTable().fnClearTable()",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_jq.getId())}));
RDebugUtils.currentLine=1507342;
 //BA.debugLineNum = 1507342;BA.debugLine="ws.Eval(\"$(arguments[0]).dataTable().fnAddData(ar";
_ws.Eval("$(arguments[0]).dataTable().fnAddData(arguments[1])",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_jq.getId()),(Object)(_data.getObject())}));
RDebugUtils.currentLine=1507343;
 //BA.debugLineNum = 1507343;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub InsertMaps(SQL As SQL, TableName As Str";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Dim sb, columns, values As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = Li";
if (_listofmaps.getSize()>1 && (_listofmaps.Get((int) (0))).equals(_listofmaps.Get((int) (1)))) { 
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="Log(\"Same Map found twice in list. Each item in";
anywheresoftware.b4a.keywords.Common.Log("Same Map found twice in list. Each item in the list should include a different map object.");
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="SQL.BeginTransaction";
_sql.BeginTransaction();
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="Try";
try {RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="For i1 = 0 To ListOfMaps.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_listofmaps.getSize()-1);
_i1 = (int) (0) ;
for (;(step8 > 0 && _i1 <= limit8) || (step8 < 0 && _i1 >= limit8) ;_i1 = ((int)(0 + _i1 + step8))  ) {
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="columns.Initialize";
_columns.Initialize();
RDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="values.Initialize";
_values.Initialize();
RDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=917518;
 //BA.debugLineNum = 917518;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
RDebugUtils.currentLine=917519;
 //BA.debugLineNum = 917519;BA.debugLine="sb.Append(\"INSERT INTO [\" & TableName & \"] (\")";
_sb.Append("INSERT INTO ["+_tablename+"] (");
RDebugUtils.currentLine=917520;
 //BA.debugLineNum = 917520;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=917521;
 //BA.debugLineNum = 917521;BA.debugLine="m = ListOfMaps.Get(i1)";
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_listofmaps.Get(_i1)));
RDebugUtils.currentLine=917522;
 //BA.debugLineNum = 917522;BA.debugLine="For i2 = 0 To m.Size - 1";
{
final int step17 = 1;
final int limit17 = (int) (_m.getSize()-1);
_i2 = (int) (0) ;
for (;(step17 > 0 && _i2 <= limit17) || (step17 < 0 && _i2 >= limit17) ;_i2 = ((int)(0 + _i2 + step17))  ) {
RDebugUtils.currentLine=917523;
 //BA.debugLineNum = 917523;BA.debugLine="Dim col As String";
_col = "";
RDebugUtils.currentLine=917524;
 //BA.debugLineNum = 917524;BA.debugLine="Dim value As Object";
_value = new Object();
RDebugUtils.currentLine=917525;
 //BA.debugLineNum = 917525;BA.debugLine="col = m.GetKeyAt(i2)";
_col = BA.ObjectToString(_m.GetKeyAt(_i2));
RDebugUtils.currentLine=917526;
 //BA.debugLineNum = 917526;BA.debugLine="value = m.GetValueAt(i2)";
_value = _m.GetValueAt(_i2);
RDebugUtils.currentLine=917527;
 //BA.debugLineNum = 917527;BA.debugLine="If i2 > 0 Then";
if (_i2>0) { 
RDebugUtils.currentLine=917528;
 //BA.debugLineNum = 917528;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
RDebugUtils.currentLine=917529;
 //BA.debugLineNum = 917529;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
RDebugUtils.currentLine=917531;
 //BA.debugLineNum = 917531;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(_escapefield(_col));
RDebugUtils.currentLine=917533;
 //BA.debugLineNum = 917533;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
RDebugUtils.currentLine=917534;
 //BA.debugLineNum = 917534;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add(_value);
 }
};
RDebugUtils.currentLine=917536;
 //BA.debugLineNum = 917536;BA.debugLine="sb.Append(columns.ToString)";
_sb.Append(_columns.ToString());
RDebugUtils.currentLine=917537;
 //BA.debugLineNum = 917537;BA.debugLine="sb.Append(\") VALUES (\")";
_sb.Append(") VALUES (");
RDebugUtils.currentLine=917538;
 //BA.debugLineNum = 917538;BA.debugLine="sb.Append(values.ToString)";
_sb.Append(_values.ToString());
RDebugUtils.currentLine=917539;
 //BA.debugLineNum = 917539;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=917541;
 //BA.debugLineNum = 917541;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, listOfValues)";
_sql.ExecNonQuery2(_sb.ToString(),_listofvalues);
 }
};
RDebugUtils.currentLine=917543;
 //BA.debugLineNum = 917543;BA.debugLine="SQL.TransactionSuccessful";
_sql.TransactionSuccessful();
 } 
       catch (Exception e38) {
			ba.setLastException(e38);RDebugUtils.currentLine=917545;
 //BA.debugLineNum = 917545;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
RDebugUtils.currentLine=917546;
 //BA.debugLineNum = 917546;BA.debugLine="SQL.Rollback";
_sql.Rollback();
 };
RDebugUtils.currentLine=917548;
 //BA.debugLineNum = 917548;BA.debugLine="End Sub";
return "";
}
public static String  _updaterecord(anywheresoftware.b4j.objects.SQL _sql,String _tablename,String _field,Object _newvalue,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "updaterecord"))
	return (String) Debug.delegate(ba, "updaterecord", new Object[] {_sql,_tablename,_field,_newvalue,_wherefieldequals});
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _args = null;
int _i = 0;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub UpdateRecord(SQL As SQL, TableName As S";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="sb.Append(\"UPDATE \").Append(EscapeField(TableName";
_sb.Append("UPDATE ").Append(_escapefield(_tablename)).Append(" SET ").Append(_escapefield(_field)).Append(" = ? WHERE ");
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
if (_wherefieldequals.getSize()==0) { 
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
anywheresoftware.b4a.keywords.Common.Log("WhereFieldEquals map empty!");
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="args.Add(NewValue)";
_args.Add(_newvalue);
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="For i = 0 To WhereFieldEquals.Size - 1";
{
final int step11 = 1;
final int limit11 = (int) (_wherefieldequals.getSize()-1);
_i = (int) (0) ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="If i > 0 Then sb.Append(\" AND \")";
if (_i>0) { 
_sb.Append(" AND ");};
RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="sb.Append(EscapeField(WhereFieldEquals.GetKeyAt(";
_sb.Append(_escapefield(BA.ObjectToString(_wherefieldequals.GetKeyAt(_i)))).Append(" = ?");
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="args.Add(WhereFieldEquals.GetValueAt(i))";
_args.Add(_wherefieldequals.GetValueAt(_i));
 }
};
RDebugUtils.currentLine=983059;
 //BA.debugLineNum = 983059;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
_sql.ExecNonQuery2(_sb.ToString(),_args);
RDebugUtils.currentLine=983060;
 //BA.debugLineNum = 983060;BA.debugLine="End Sub";
return "";
}
public static String  _updaterecord2(anywheresoftware.b4j.objects.SQL _sql,String _tablename,anywheresoftware.b4a.objects.collections.Map _fields,anywheresoftware.b4a.objects.collections.Map _wherefieldequals) throws Exception{
RDebugUtils.currentModule="dbutils";
if (Debug.shouldDelegate(ba, "updaterecord2"))
	return (String) Debug.delegate(ba, "updaterecord2", new Object[] {_sql,_tablename,_fields,_wherefieldequals});
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.List _args = null;
int _i = 0;
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub UpdateRecord2(SQL As SQL, TableName As";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
if (_wherefieldequals.getSize()==0) { 
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
anywheresoftware.b4a.keywords.Common.Log("WhereFieldEquals map empty!");
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="If Fields.Size = 0 Then";
if (_fields.getSize()==0) { 
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="Log(\"Fields empty\")";
anywheresoftware.b4a.keywords.Common.Log("Fields empty");
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="sb.Append(\"UPDATE \").Append(EscapeField(TableName";
_sb.Append("UPDATE ").Append(_escapefield(_tablename)).Append(" SET ");
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="For i=0 To Fields.Size-1";
{
final int step14 = 1;
final int limit14 = (int) (_fields.getSize()-1);
_i = (int) (0) ;
for (;(step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14) ;_i = ((int)(0 + _i + step14))  ) {
RDebugUtils.currentLine=1048591;
 //BA.debugLineNum = 1048591;BA.debugLine="If i<>Fields.Size-1 Then";
if (_i!=_fields.getSize()-1) { 
RDebugUtils.currentLine=1048592;
 //BA.debugLineNum = 1048592;BA.debugLine="sb.Append(EscapeField(Fields.GetKeyAt(i))).Appe";
_sb.Append(_escapefield(BA.ObjectToString(_fields.GetKeyAt(_i)))).Append("=?,");
 }else {
RDebugUtils.currentLine=1048594;
 //BA.debugLineNum = 1048594;BA.debugLine="sb.Append(EscapeField(Fields.GetKeyAt(i))).Appe";
_sb.Append(_escapefield(BA.ObjectToString(_fields.GetKeyAt(_i)))).Append("=?");
 };
RDebugUtils.currentLine=1048596;
 //BA.debugLineNum = 1048596;BA.debugLine="args.Add(Fields.GetValueAt(i))";
_args.Add(_fields.GetValueAt(_i));
 }
};
RDebugUtils.currentLine=1048599;
 //BA.debugLineNum = 1048599;BA.debugLine="sb.Append(\" WHERE \")";
_sb.Append(" WHERE ");
RDebugUtils.currentLine=1048600;
 //BA.debugLineNum = 1048600;BA.debugLine="For i = 0 To WhereFieldEquals.Size - 1";
{
final int step23 = 1;
final int limit23 = (int) (_wherefieldequals.getSize()-1);
_i = (int) (0) ;
for (;(step23 > 0 && _i <= limit23) || (step23 < 0 && _i >= limit23) ;_i = ((int)(0 + _i + step23))  ) {
RDebugUtils.currentLine=1048601;
 //BA.debugLineNum = 1048601;BA.debugLine="If i > 0 Then";
if (_i>0) { 
RDebugUtils.currentLine=1048602;
 //BA.debugLineNum = 1048602;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
RDebugUtils.currentLine=1048604;
 //BA.debugLineNum = 1048604;BA.debugLine="sb.Append(EscapeField(WhereFieldEquals.GetKeyAt(";
_sb.Append(_escapefield(BA.ObjectToString(_wherefieldequals.GetKeyAt(_i)))).Append(" = ?");
RDebugUtils.currentLine=1048605;
 //BA.debugLineNum = 1048605;BA.debugLine="args.Add(WhereFieldEquals.GetValueAt(i))";
_args.Add(_wherefieldequals.GetValueAt(_i));
 }
};
RDebugUtils.currentLine=1048608;
 //BA.debugLineNum = 1048608;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
_sql.ExecNonQuery2(_sb.ToString(),_args);
RDebugUtils.currentLine=1048609;
 //BA.debugLineNum = 1048609;BA.debugLine="End Sub";
return "";
}
}