package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dbutils_subs_0 {


public static RemoteObject  _createtable(RemoteObject _sql,RemoteObject _tablename,RemoteObject _fieldsandtypes,RemoteObject _primarykey) throws Exception{
try {
		Debug.PushSubsStack("CreateTable (dbutils) ","dbutils",7,dbutils.ba,dbutils.mostCurrent,23);
if (RapidSub.canDelegate("createtable")) return b4j.example.dbutils.remoteMe.runUserSub(false, "dbutils","createtable", _sql, _tablename, _fieldsandtypes, _primarykey);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
RemoteObject _field = RemoteObject.createImmutable("");
RemoteObject _ftype = RemoteObject.createImmutable("");
RemoteObject _query = RemoteObject.createImmutable("");
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("FieldsAndTypes", _fieldsandtypes);
Debug.locals.put("PrimaryKey", _primarykey);
 BA.debugLineNum = 23;BA.debugLine="Public Sub CreateTable(SQL As SQL, TableName As St";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(8388608);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 25;BA.debugLine="sb.Initialize";
Debug.ShouldStop(16777216);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 26;BA.debugLine="sb.Append(\"(\")";
Debug.ShouldStop(33554432);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("(")));
 BA.debugLineNum = 27;BA.debugLine="For i = 0 To FieldsAndTypes.Size - 1";
Debug.ShouldStop(67108864);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_fieldsandtypes.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 28;BA.debugLine="Dim field, ftype As String";
Debug.ShouldStop(134217728);
_field = RemoteObject.createImmutable("");Debug.locals.put("field", _field);
_ftype = RemoteObject.createImmutable("");Debug.locals.put("ftype", _ftype);
 BA.debugLineNum = 29;BA.debugLine="field = FieldsAndTypes.GetKeyAt(i)";
Debug.ShouldStop(268435456);
_field = BA.ObjectToString(_fieldsandtypes.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("field", _field);
 BA.debugLineNum = 30;BA.debugLine="ftype = FieldsAndTypes.GetValueAt(i)";
Debug.ShouldStop(536870912);
_ftype = BA.ObjectToString(_fieldsandtypes.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ftype", _ftype);
 BA.debugLineNum = 31;BA.debugLine="If i > 0 Then sb.Append(\", \")";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));};
 BA.debugLineNum = 32;BA.debugLine="sb.Append(EscapeField(field)).Append(\" \").Append";
Debug.ShouldStop(-2147483648);
_sb.runMethod(false,"Append",(Object)(_escapefield(_field))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" "))).runVoidMethod ("Append",(Object)(_ftype));
 BA.debugLineNum = 33;BA.debugLine="If field = PrimaryKey Then sb.Append(\" PRIMARY K";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_field,_primarykey)) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" PRIMARY KEY")));};
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 35;BA.debugLine="sb.Append(\")\")";
Debug.ShouldStop(4);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 36;BA.debugLine="Dim query As String";
Debug.ShouldStop(8);
_query = RemoteObject.createImmutable("");Debug.locals.put("query", _query);
 BA.debugLineNum = 37;BA.debugLine="query = \"CREATE TABLE IF NOT EXISTS \" & EscapeFie";
Debug.ShouldStop(16);
_query = RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS "),_escapefield(_tablename),RemoteObject.createImmutable(" "),_sb.runMethod(true,"ToString"));Debug.locals.put("query", _query);
 BA.debugLineNum = 38;BA.debugLine="Log(\"CreateTable: \" & query)";
Debug.ShouldStop(32);
dbutils.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("CreateTable: "),_query)));
 BA.debugLineNum = 39;BA.debugLine="SQL.ExecNonQuery(query)";
Debug.ShouldStop(64);
_sql.runVoidMethod ("ExecNonQuery",(Object)(_query));
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deleterecord(RemoteObject _sql,RemoteObject _tablename,RemoteObject _wherefieldequals) throws Exception{
try {
		Debug.PushSubsStack("DeleteRecord (dbutils) ","dbutils",7,dbutils.ba,dbutils.mostCurrent,318);
if (RapidSub.canDelegate("deleterecord")) return b4j.example.dbutils.remoteMe.runUserSub(false, "dbutils","deleterecord", _sql, _tablename, _wherefieldequals);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _args = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("WhereFieldEquals", _wherefieldequals);
 BA.debugLineNum = 318;BA.debugLine="Public Sub DeleteRecord(SQL As SQL, TableName As S";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 319;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(1073741824);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 320;BA.debugLine="sb.Initialize";
Debug.ShouldStop(-2147483648);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 321;BA.debugLine="sb.Append(\"DELETE FROM [\").Append(TableName).Ap";
Debug.ShouldStop(1);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("DELETE FROM ["))).runMethod(false,"Append",(Object)(_tablename)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("] WHERE ")));
 BA.debugLineNum = 322;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_wherefieldequals.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 323;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
Debug.ShouldStop(4);
dbutils.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("WhereFieldEquals map empty!")));
 BA.debugLineNum = 324;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 326;BA.debugLine="Dim args As List";
Debug.ShouldStop(32);
_args = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("args", _args);
 BA.debugLineNum = 327;BA.debugLine="args.Initialize";
Debug.ShouldStop(64);
_args.runVoidMethod ("Initialize");
 BA.debugLineNum = 328;BA.debugLine="For i = 0 To WhereFieldEquals.Size - 1";
Debug.ShouldStop(128);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {_wherefieldequals.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 329;BA.debugLine="If i > 0 Then sb.Append(\" AND \")";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" AND ")));};
 BA.debugLineNum = 330;BA.debugLine="sb.Append(\"[\").Append(WhereFieldEquals.GetKe";
Debug.ShouldStop(512);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("["))).runMethod(false,"Append",(Object)(BA.ObjectToString(_wherefieldequals.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("] = ?")));
 BA.debugLineNum = 331;BA.debugLine="args.Add(WhereFieldEquals.GetValueAt(i))";
Debug.ShouldStop(1024);
_args.runVoidMethod ("Add",(Object)(_wherefieldequals.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 334;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
Debug.ShouldStop(8192);
_sql.runVoidMethod ("ExecNonQuery2",(Object)(_sb.runMethod(true,"ToString")),(Object)(_args));
 BA.debugLineNum = 335;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _droptable(RemoteObject _sql,RemoteObject _tablename) throws Exception{
try {
		Debug.PushSubsStack("DropTable (dbutils) ","dbutils",7,dbutils.ba,dbutils.mostCurrent,43);
if (RapidSub.canDelegate("droptable")) return b4j.example.dbutils.remoteMe.runUserSub(false, "dbutils","droptable", _sql, _tablename);
RemoteObject _query = RemoteObject.createImmutable("");
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
 BA.debugLineNum = 43;BA.debugLine="Public Sub DropTable(SQL As SQL, TableName As Stri";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="Dim query As String";
Debug.ShouldStop(2048);
_query = RemoteObject.createImmutable("");Debug.locals.put("query", _query);
 BA.debugLineNum = 45;BA.debugLine="query = \"DROP TABLE IF EXISTS \" & EscapeField(Tab";
Debug.ShouldStop(4096);
_query = RemoteObject.concat(RemoteObject.createImmutable("DROP TABLE IF EXISTS "),_escapefield(_tablename));Debug.locals.put("query", _query);
 BA.debugLineNum = 46;BA.debugLine="Log(\"DropTable3: \" & query)";
Debug.ShouldStop(8192);
dbutils.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("DropTable3: "),_query)));
 BA.debugLineNum = 47;BA.debugLine="SQL.ExecNonQuery(query)";
Debug.ShouldStop(16384);
_sql.runVoidMethod ("ExecNonQuery",(Object)(_query));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _escapefield(RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("EscapeField (dbutils) ","dbutils",7,dbutils.ba,dbutils.mostCurrent,15);
if (RapidSub.canDelegate("escapefield")) return b4j.example.dbutils.remoteMe.runUserSub(false, "dbutils","escapefield", _f);
Debug.locals.put("f", _f);
 BA.debugLineNum = 15;BA.debugLine="Private Sub EscapeField(f As String) As String";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="Return \"[\" & f & \"]\"";
Debug.ShouldStop(32768);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("["),_f,RemoteObject.createImmutable("]"));
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executehtml(RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit) throws Exception{
try {
		Debug.PushSubsStack("ExecuteHtml (dbutils) ","dbutils",7,dbutils.ba,dbutils.mostCurrent,271);
if (RapidSub.canDelegate("executehtml")) return b4j.example.dbutils.remoteMe.runUserSub(false, "dbutils","executehtml", _sql, _query, _stringargs, _limit);
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
RemoteObject _row = RemoteObject.createImmutable(0);
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
 BA.debugLineNum = 271;BA.debugLine="Public Sub ExecuteHtml(SQL As SQL, Query As String";
Debug.ShouldStop(16384);
 BA.debugLineNum = 272;BA.debugLine="Dim cur As ResultSet";
Debug.ShouldStop(32768);
_cur = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("cur", _cur);
 BA.debugLineNum = 273;BA.debugLine="If StringArgs <> Null Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("N",_stringargs)) { 
 BA.debugLineNum = 274;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
Debug.ShouldStop(131072);
_cur = _sql.runMethod(false,"ExecQuery2",(Object)(_query),(Object)(dbutils.__c.runMethod(false, "ArrayToList", (Object)(_stringargs))));Debug.locals.put("cur", _cur);
 }else {
 BA.debugLineNum = 276;BA.debugLine="cur = SQL.ExecQuery(Query)";
Debug.ShouldStop(524288);
_cur = _sql.runMethod(false,"ExecQuery",(Object)(_query));Debug.locals.put("cur", _cur);
 };
 BA.debugLineNum = 278;BA.debugLine="Log(\"ExecuteHtml: \" & Query)";
Debug.ShouldStop(2097152);
dbutils.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ExecuteHtml: "),_query)));
 BA.debugLineNum = 279;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(4194304);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 280;BA.debugLine="sb.Initialize";
Debug.ShouldStop(8388608);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 281;BA.debugLine="sb.Append(\"<html><body>\").Append(CRLF)";
Debug.ShouldStop(16777216);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<html><body>"))).runVoidMethod ("Append",(Object)(dbutils.__c.getField(true,"CRLF")));
 BA.debugLineNum = 282;BA.debugLine="sb.Append(\"<style type='text/css'>\").Append(HtmlC";
Debug.ShouldStop(33554432);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<style type='text/css'>"))).runMethod(false,"Append",(Object)(dbutils._htmlcss)).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("</style>"))).runVoidMethod ("Append",(Object)(dbutils.__c.getField(true,"CRLF")));
 BA.debugLineNum = 283;BA.debugLine="sb.Append(\"<table><thead><tr>\").Append(CRLF)";
Debug.ShouldStop(67108864);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<table><thead><tr>"))).runVoidMethod ("Append",(Object)(dbutils.__c.getField(true,"CRLF")));
 BA.debugLineNum = 284;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(134217728);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 285;BA.debugLine="sb.Append(\"<th>\").Append(cur.GetColumnName(i)).A";
Debug.ShouldStop(268435456);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("<th>"))).runMethod(false,"Append",(Object)(_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</th>")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 287;BA.debugLine="sb.Append(\"</thead>\")";
Debug.ShouldStop(1073741824);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</thead>")));
 BA.debugLineNum = 297;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
Debug.ShouldStop(256);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("</tr>"))).runVoidMethod ("Append",(Object)(dbutils.__c.getField(true,"CRLF")));
 BA.debugLineNum = 298;BA.debugLine="Dim row As Int";
Debug.ShouldStop(512);
_row = RemoteObject.createImmutable(0);Debug.locals.put("row", _row);
 BA.debugLineNum = 299;BA.debugLine="Do While cur.NextRow";
Debug.ShouldStop(1024);
while (_cur.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 300;BA.debugLine="If row Mod 2 = 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 301;BA.debugLine="sb.Append(\"<tr>\")";
Debug.ShouldStop(4096);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("<tr>")));
 }else {
 BA.debugLineNum = 303;BA.debugLine="sb.Append(\"<tr class='odd'>\")";
Debug.ShouldStop(16384);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("<tr class='odd'>")));
 };
 BA.debugLineNum = 305;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(65536);
{
final int step25 = 1;
final int limit25 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step25 > 0 && _i <= limit25) || (step25 < 0 && _i >= limit25) ;_i = ((int)(0 + _i + step25))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 306;BA.debugLine="sb.Append(\"<td>\")";
Debug.ShouldStop(131072);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("<td>")));
 BA.debugLineNum = 307;BA.debugLine="sb.Append(cur.GetString2(i))";
Debug.ShouldStop(262144);
_sb.runVoidMethod ("Append",(Object)(_cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 308;BA.debugLine="sb.Append(\"</td>\")";
Debug.ShouldStop(524288);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</td>")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 310;BA.debugLine="sb.Append(\"</tr>\").Append(CRLF)";
Debug.ShouldStop(2097152);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("</tr>"))).runVoidMethod ("Append",(Object)(dbutils.__c.getField(true,"CRLF")));
 BA.debugLineNum = 311;BA.debugLine="row = row + 1";
Debug.ShouldStop(4194304);
_row = RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("row", _row);
 }
;
 BA.debugLineNum = 313;BA.debugLine="cur.Close";
Debug.ShouldStop(16777216);
_cur.runVoidMethod ("Close");
 BA.debugLineNum = 314;BA.debugLine="sb.Append(\"</table></body></html>\")";
Debug.ShouldStop(33554432);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("</table></body></html>")));
 BA.debugLineNum = 315;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(67108864);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 316;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executejson(RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit,RemoteObject _dbtypes) throws Exception{
try {
		Debug.PushSubsStack("ExecuteJSON (dbutils) ","dbutils",7,dbutils.ba,dbutils.mostCurrent,231);
if (RapidSub.canDelegate("executejson")) return b4j.example.dbutils.remoteMe.runUserSub(false, "dbutils","executejson", _sql, _query, _stringargs, _limit, _dbtypes);
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
Debug.locals.put("DBTypes", _dbtypes);
 BA.debugLineNum = 231;BA.debugLine="Public Sub ExecuteJSON (SQL As SQL, Query As Strin";
Debug.ShouldStop(64);
 BA.debugLineNum = 232;BA.debugLine="Dim table As List";
Debug.ShouldStop(128);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("table", _table);
 BA.debugLineNum = 233;BA.debugLine="Dim cur As ResultSet";
Debug.ShouldStop(256);
_cur = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("cur", _cur);
 BA.debugLineNum = 234;BA.debugLine="If StringArgs <> Null Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("N",_stringargs)) { 
 BA.debugLineNum = 235;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
Debug.ShouldStop(1024);
_cur = _sql.runMethod(false,"ExecQuery2",(Object)(_query),(Object)(dbutils.__c.runMethod(false, "ArrayToList", (Object)(_stringargs))));Debug.locals.put("cur", _cur);
 }else {
 BA.debugLineNum = 237;BA.debugLine="cur = SQL.ExecQuery(Query)";
Debug.ShouldStop(4096);
_cur = _sql.runMethod(false,"ExecQuery",(Object)(_query));Debug.locals.put("cur", _cur);
 };
 BA.debugLineNum = 239;BA.debugLine="Log(\"ExecuteJSON: \" & Query)";
Debug.ShouldStop(16384);
dbutils.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ExecuteJSON: "),_query)));
 BA.debugLineNum = 240;BA.debugLine="Dim table As List";
Debug.ShouldStop(32768);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("table", _table);
 BA.debugLineNum = 241;BA.debugLine="table.Initialize";
Debug.ShouldStop(65536);
_table.runVoidMethod ("Initialize");
 BA.debugLineNum = 242;BA.debugLine="Do While cur.NextRow";
Debug.ShouldStop(131072);
while (_cur.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 243;BA.debugLine="Dim m As Map";
Debug.ShouldStop(262144);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 244;BA.debugLine="m.Initialize";
Debug.ShouldStop(524288);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 245;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(1048576);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14) ;_i = ((int)(0 + _i + step14))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 246;BA.debugLine="Select DBTypes.Get(i)";
Debug.ShouldStop(2097152);
switch (BA.switchObjectToInt(_dbtypes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),(dbutils._db_text),(dbutils._db_integer),(dbutils._db_real))) {
case 0: {
 BA.debugLineNum = 248;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetString2(i)";
Debug.ShouldStop(8388608);
_m.runVoidMethod ("Put",(Object)((_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))))),(Object)((_cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i))))));
 break; }
case 1: {
 BA.debugLineNum = 250;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetLong2(i))";
Debug.ShouldStop(33554432);
_m.runVoidMethod ("Put",(Object)((_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))))),(Object)((_cur.runMethod(true,"GetLong2",(Object)(BA.numberCast(int.class, _i))))));
 break; }
case 2: {
 BA.debugLineNum = 252;BA.debugLine="m.Put(cur.GetColumnName(i), cur.GetDouble2(i)";
Debug.ShouldStop(134217728);
_m.runVoidMethod ("Put",(Object)((_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))))),(Object)((_cur.runMethod(true,"GetDouble2",(Object)(BA.numberCast(int.class, _i))))));
 break; }
default: {
 BA.debugLineNum = 254;BA.debugLine="Log(\"Invalid type: \" & DBTypes.Get(i))";
Debug.ShouldStop(536870912);
dbutils.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Invalid type: "),_dbtypes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 break; }
}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 257;BA.debugLine="table.Add(m)";
Debug.ShouldStop(1);
_table.runVoidMethod ("Add",(Object)((_m.getObject())));
 BA.debugLineNum = 258;BA.debugLine="If Limit > 0 And m.Size >= Limit Then Exit";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_limit,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("g",_m.runMethod(true,"getSize"),BA.numberCast(double.class, _limit))) { 
if (true) break;};
 }
;
 BA.debugLineNum = 260;BA.debugLine="cur.Close";
Debug.ShouldStop(8);
_cur.runVoidMethod ("Close");
 BA.debugLineNum = 261;BA.debugLine="Dim root As Map";
Debug.ShouldStop(16);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("root", _root);
 BA.debugLineNum = 262;BA.debugLine="root.Initialize";
Debug.ShouldStop(32);
_root.runVoidMethod ("Initialize");
 BA.debugLineNum = 263;BA.debugLine="root.Put(\"root\", table)";
Debug.ShouldStop(64);
_root.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("root"))),(Object)((_table.getObject())));
 BA.debugLineNum = 264;BA.debugLine="Return root";
Debug.ShouldStop(128);
if (true) return _root;
 BA.debugLineNum = 265;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executelist(RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit,RemoteObject _list1) throws Exception{
try {
		Debug.PushSubsStack("ExecuteList (dbutils) ","dbutils",7,dbutils.ba,dbutils.mostCurrent,213);
if (RapidSub.canDelegate("executelist")) return b4j.example.dbutils.remoteMe.runUserSub(false, "dbutils","executelist", _sql, _query, _stringargs, _limit, _list1);
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cols = null;
int _i = 0;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
Debug.locals.put("Limit", _limit);
Debug.locals.put("List1", _list1);
 BA.debugLineNum = 213;BA.debugLine="Public Sub ExecuteList(SQL As SQL, Query As String";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 214;BA.debugLine="List1.Clear";
Debug.ShouldStop(2097152);
_list1.runVoidMethod ("Clear");
 BA.debugLineNum = 215;BA.debugLine="Dim Table As List";
Debug.ShouldStop(4194304);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Table", _table);
 BA.debugLineNum = 216;BA.debugLine="Table = ExecuteMemoryTable(SQL, Query, StringArgs";
Debug.ShouldStop(8388608);
_table = _executememorytable(_sql,_query,_stringargs,_limit);Debug.locals.put("Table", _table);
 BA.debugLineNum = 217;BA.debugLine="If Table.Size = 0 Then Return";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_table.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 218;BA.debugLine="Dim Cols() As String";
Debug.ShouldStop(33554432);
_cols = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 219;BA.debugLine="For i = 0 To Table.Size - 1";
Debug.ShouldStop(67108864);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_table.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 220;BA.debugLine="Cols = Table.Get(i)";
Debug.ShouldStop(134217728);
_cols = (_table.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 221;BA.debugLine="List1.Add(Cols(0))";
Debug.ShouldStop(268435456);
_list1.runVoidMethod ("Add",(Object)((_cols.getArrayElement(true,BA.numberCast(int.class, 0)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 223;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executemap(RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs) throws Exception{
try {
		Debug.PushSubsStack("ExecuteMap (dbutils) ","dbutils",7,dbutils.ba,dbutils.mostCurrent,191);
if (RapidSub.canDelegate("executemap")) return b4j.example.dbutils.remoteMe.runUserSub(false, "dbutils","executemap", _sql, _query, _stringargs);
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
int _i = 0;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("StringArgs", _stringargs);
 BA.debugLineNum = 191;BA.debugLine="Public Sub ExecuteMap(SQL As SQL, Query As String,";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 192;BA.debugLine="Dim res As Map";
Debug.ShouldStop(-2147483648);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("res", _res);
 BA.debugLineNum = 193;BA.debugLine="Dim cur As ResultSet";
Debug.ShouldStop(1);
_cur = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("cur", _cur);
 BA.debugLineNum = 194;BA.debugLine="If StringArgs <> Null Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("N",_stringargs)) { 
 BA.debugLineNum = 195;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
Debug.ShouldStop(4);
_cur = _sql.runMethod(false,"ExecQuery2",(Object)(_query),(Object)(dbutils.__c.runMethod(false, "ArrayToList", (Object)(_stringargs))));Debug.locals.put("cur", _cur);
 }else {
 BA.debugLineNum = 197;BA.debugLine="cur = SQL.ExecQuery(Query)";
Debug.ShouldStop(16);
_cur = _sql.runMethod(false,"ExecQuery",(Object)(_query));Debug.locals.put("cur", _cur);
 };
 BA.debugLineNum = 200;BA.debugLine="If cur.NextRow = False Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"NextRow"),dbutils.__c.getField(true,"False"))) { 
 BA.debugLineNum = 201;BA.debugLine="Log(\"No records found.\")";
Debug.ShouldStop(256);
dbutils.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("No records found.")));
 BA.debugLineNum = 202;BA.debugLine="Return res";
Debug.ShouldStop(512);
if (true) return _res;
 };
 BA.debugLineNum = 204;BA.debugLine="res.Initialize";
Debug.ShouldStop(2048);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 205;BA.debugLine="For i = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(4096);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 206;BA.debugLine="res.Put(cur.GetColumnName(i).ToLowerCase, cur.Ge";
Debug.ShouldStop(8192);
_res.runVoidMethod ("Put",(Object)((_cur.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))).runMethod(true,"toLowerCase"))),(Object)((_cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 208;BA.debugLine="cur.Close";
Debug.ShouldStop(32768);
_cur.runVoidMethod ("Close");
 BA.debugLineNum = 209;BA.debugLine="Return res";
Debug.ShouldStop(65536);
if (true) return _res;
 BA.debugLineNum = 210;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executememorytable(RemoteObject _sql,RemoteObject _query,RemoteObject _stringargs,RemoteObject _limit) throws Exception{
try {
		Debug.PushSubsStack("ExecuteMemoryTable (dbutils) ","dbutils",7,dbutils.ba,dbutils.mostCurrent,166);
if (RapidSub.canDelegate("executememorytable")) return b4j.example.dbutils.remoteMe.runUserSub(false, "dbutils","executememorytable", _sql, _query, _stringargs, _limit);
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _values = null;
int _col = 0;
Debug.locals.put("SQL", _sql);
Debug.locals.put("Query", _query);
Debug.locals.put("Limit", _limit);
 BA.debugLineNum = 166;BA.debugLine="Public Sub ExecuteMemoryTable(SQL As SQL, Query As";
Debug.ShouldStop(32);
 BA.debugLineNum = 167;BA.debugLine="Dim cur As ResultSet";
Debug.ShouldStop(64);
_cur = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");Debug.locals.put("cur", _cur);
 BA.debugLineNum = 168;BA.debugLine="If StringArgs = Null Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("n",_stringargs)) { 
 BA.debugLineNum = 169;BA.debugLine="Dim StringArgs(0) As String";
Debug.ShouldStop(256);
_stringargs = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("StringArgs", _stringargs);
 };
 BA.debugLineNum = 171;BA.debugLine="cur = SQL.ExecQuery2(Query, StringArgs)";
Debug.ShouldStop(1024);
_cur = _sql.runMethod(false,"ExecQuery2",(Object)(_query),(Object)(dbutils.__c.runMethod(false, "ArrayToList", (Object)(_stringargs))));Debug.locals.put("cur", _cur);
 BA.debugLineNum = 173;BA.debugLine="Dim table As List";
Debug.ShouldStop(4096);
_table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("table", _table);
 BA.debugLineNum = 174;BA.debugLine="table.Initialize";
Debug.ShouldStop(8192);
_table.runVoidMethod ("Initialize");
 BA.debugLineNum = 175;BA.debugLine="Do While cur.NextRow";
Debug.ShouldStop(16384);
while (_cur.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 176;BA.debugLine="Dim values(cur.ColumnCount) As String";
Debug.ShouldStop(32768);
_values = RemoteObject.createNewArray ("String", new int[] {_cur.runMethod(true,"getColumnCount").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("values", _values);
 BA.debugLineNum = 177;BA.debugLine="For col = 0 To cur.ColumnCount - 1";
Debug.ShouldStop(65536);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_col = 0 ;
for (;(step10 > 0 && _col <= limit10) || (step10 < 0 && _col >= limit10) ;_col = ((int)(0 + _col + step10))  ) {
Debug.locals.put("col", _col);
 BA.debugLineNum = 178;BA.debugLine="values(col) = cur.GetString2(col)";
Debug.ShouldStop(131072);
_values.setArrayElement (_cur.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _col))),BA.numberCast(int.class, _col));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 180;BA.debugLine="table.Add(values)";
Debug.ShouldStop(524288);
_table.runVoidMethod ("Add",(Object)((_values)));
 BA.debugLineNum = 181;BA.debugLine="If Limit > 0 And table.Size >= Limit Then Exit";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",_limit,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("g",_table.runMethod(true,"getSize"),BA.numberCast(double.class, _limit))) { 
if (true) break;};
 }
;
 BA.debugLineNum = 183;BA.debugLine="cur.Close";
Debug.ShouldStop(4194304);
_cur.runVoidMethod ("Close");
 BA.debugLineNum = 184;BA.debugLine="Return table";
Debug.ShouldStop(8388608);
if (true) return _table;
 BA.debugLineNum = 185;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _filltable(RemoteObject _ws,RemoteObject _jq,RemoteObject _rs) throws Exception{
try {
		Debug.PushSubsStack("FillTable (dbutils) ","dbutils",7,dbutils.ba,dbutils.mostCurrent,338);
if (RapidSub.canDelegate("filltable")) return b4j.example.dbutils.remoteMe.runUserSub(false, "dbutils","filltable", _ws, _jq, _rs);
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _c = 0;
RemoteObject _val = RemoteObject.createImmutable("");
Debug.locals.put("ws", _ws);
Debug.locals.put("jq", _jq);
Debug.locals.put("rs", _rs);
 BA.debugLineNum = 338;BA.debugLine="Public Sub FillTable(ws As WebSocket, jq As JQuery";
Debug.ShouldStop(131072);
 BA.debugLineNum = 339;BA.debugLine="Dim data As List";
Debug.ShouldStop(262144);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data", _data);
 BA.debugLineNum = 340;BA.debugLine="data.Initialize";
Debug.ShouldStop(524288);
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 341;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(1048576);
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 342;BA.debugLine="Dim row As List";
Debug.ShouldStop(2097152);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("row", _row);
 BA.debugLineNum = 343;BA.debugLine="row.Initialize";
Debug.ShouldStop(4194304);
_row.runVoidMethod ("Initialize");
 BA.debugLineNum = 344;BA.debugLine="For c = 0 To rs.ColumnCount - 1";
Debug.ShouldStop(8388608);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_rs.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_c = 0 ;
for (;(step6 > 0 && _c <= limit6) || (step6 < 0 && _c >= limit6) ;_c = ((int)(0 + _c + step6))  ) {
Debug.locals.put("c", _c);
 BA.debugLineNum = 345;BA.debugLine="Dim val As String = rs.GetString2(c)";
Debug.ShouldStop(16777216);
_val = _rs.runMethod(true,"GetString2",(Object)(BA.numberCast(int.class, _c)));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 346;BA.debugLine="row.Add($\"$Xml{val}\"$)";
Debug.ShouldStop(33554432);
_row.runVoidMethod ("Add",(Object)(((RemoteObject.concat(RemoteObject.createImmutable(""),dbutils.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("xml")),(Object)((_val))),RemoteObject.createImmutable(""))))));
 }
}Debug.locals.put("c", _c);
;
 BA.debugLineNum = 348;BA.debugLine="data.Add(row)";
Debug.ShouldStop(134217728);
_data.runVoidMethod ("Add",(Object)((_row.getObject())));
 }
;
 BA.debugLineNum = 350;BA.debugLine="rs.Close";
Debug.ShouldStop(536870912);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 351;BA.debugLine="ws.Eval(\"$(arguments[0]).dataTable().fnClearTable";
Debug.ShouldStop(1073741824);
_ws.runVoidMethod ("Eval",(Object)(BA.ObjectToString("$(arguments[0]).dataTable().fnClearTable()")),(Object)(dbutils.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_jq.runMethod(true,"getId"))})))));
 BA.debugLineNum = 352;BA.debugLine="ws.Eval(\"$(arguments[0]).dataTable().fnAddData(ar";
Debug.ShouldStop(-2147483648);
_ws.runVoidMethod ("Eval",(Object)(BA.ObjectToString("$(arguments[0]).dataTable().fnAddData(arguments[1])")),(Object)(dbutils.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_jq.runMethod(true,"getId")),(_data.getObject())})))));
 BA.debugLineNum = 353;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertmaps(RemoteObject _sql,RemoteObject _tablename,RemoteObject _listofmaps) throws Exception{
try {
		Debug.PushSubsStack("InsertMaps (dbutils) ","dbutils",7,dbutils.ba,dbutils.mostCurrent,55);
if (RapidSub.canDelegate("insertmaps")) return b4j.example.dbutils.remoteMe.runUserSub(false, "dbutils","insertmaps", _sql, _tablename, _listofmaps);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _columns = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _values = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i1 = 0;
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i2 = 0;
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _value = RemoteObject.declareNull("Object");
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 55;BA.debugLine="Public Sub InsertMaps(SQL As SQL, TableName As Str";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Dim sb, columns, values As StringBuilder";
Debug.ShouldStop(8388608);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
_columns = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("columns", _columns);
_values = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("values", _values);
 BA.debugLineNum = 58;BA.debugLine="If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = Li";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_listofmaps.runMethod(true,"getSize"),BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean("=",_listofmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),_listofmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))) { 
 BA.debugLineNum = 59;BA.debugLine="Log(\"Same Map found twice in list. Each item in";
Debug.ShouldStop(67108864);
dbutils.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Same Map found twice in list. Each item in the list should include a different map object.")));
 BA.debugLineNum = 60;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 62;BA.debugLine="SQL.BeginTransaction";
Debug.ShouldStop(536870912);
_sql.runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 63;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
try { BA.debugLineNum = 64;BA.debugLine="For i1 = 0 To ListOfMaps.Size - 1";
Debug.ShouldStop(-2147483648);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_listofmaps.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i1 = 0 ;
for (;(step8 > 0 && _i1 <= limit8) || (step8 < 0 && _i1 >= limit8) ;_i1 = ((int)(0 + _i1 + step8))  ) {
Debug.locals.put("i1", _i1);
 BA.debugLineNum = 65;BA.debugLine="sb.Initialize";
Debug.ShouldStop(1);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 66;BA.debugLine="columns.Initialize";
Debug.ShouldStop(2);
_columns.runVoidMethod ("Initialize");
 BA.debugLineNum = 67;BA.debugLine="values.Initialize";
Debug.ShouldStop(4);
_values.runVoidMethod ("Initialize");
 BA.debugLineNum = 68;BA.debugLine="Dim listOfValues As List";
Debug.ShouldStop(8);
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 69;BA.debugLine="listOfValues.Initialize";
Debug.ShouldStop(16);
_listofvalues.runVoidMethod ("Initialize");
 BA.debugLineNum = 70;BA.debugLine="sb.Append(\"INSERT INTO [\" & TableName & \"] (\")";
Debug.ShouldStop(32);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO ["),_tablename,RemoteObject.createImmutable("] ("))));
 BA.debugLineNum = 71;BA.debugLine="Dim m As Map";
Debug.ShouldStop(64);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 72;BA.debugLine="m = ListOfMaps.Get(i1)";
Debug.ShouldStop(128);
_m.setObject(_listofmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i1))));
 BA.debugLineNum = 73;BA.debugLine="For i2 = 0 To m.Size - 1";
Debug.ShouldStop(256);
{
final int step17 = 1;
final int limit17 = RemoteObject.solve(new RemoteObject[] {_m.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i2 = 0 ;
for (;(step17 > 0 && _i2 <= limit17) || (step17 < 0 && _i2 >= limit17) ;_i2 = ((int)(0 + _i2 + step17))  ) {
Debug.locals.put("i2", _i2);
 BA.debugLineNum = 74;BA.debugLine="Dim col As String";
Debug.ShouldStop(512);
_col = RemoteObject.createImmutable("");Debug.locals.put("col", _col);
 BA.debugLineNum = 75;BA.debugLine="Dim value As Object";
Debug.ShouldStop(1024);
_value = RemoteObject.createNew ("Object");Debug.locals.put("value", _value);
 BA.debugLineNum = 76;BA.debugLine="col = m.GetKeyAt(i2)";
Debug.ShouldStop(2048);
_col = BA.ObjectToString(_m.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i2))));Debug.locals.put("col", _col);
 BA.debugLineNum = 77;BA.debugLine="value = m.GetValueAt(i2)";
Debug.ShouldStop(4096);
_value = _m.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i2)));Debug.locals.put("value", _value);
 BA.debugLineNum = 78;BA.debugLine="If i2 > 0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i2),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 79;BA.debugLine="columns.Append(\", \")";
Debug.ShouldStop(16384);
_columns.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 BA.debugLineNum = 80;BA.debugLine="values.Append(\", \")";
Debug.ShouldStop(32768);
_values.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 };
 BA.debugLineNum = 82;BA.debugLine="columns.Append(EscapeField(col))";
Debug.ShouldStop(131072);
_columns.runVoidMethod ("Append",(Object)(_escapefield(_col)));
 BA.debugLineNum = 84;BA.debugLine="values.Append(\"?\")";
Debug.ShouldStop(524288);
_values.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("?")));
 BA.debugLineNum = 85;BA.debugLine="listOfValues.Add(value)";
Debug.ShouldStop(1048576);
_listofvalues.runVoidMethod ("Add",(Object)(_value));
 }
}Debug.locals.put("i2", _i2);
;
 BA.debugLineNum = 87;BA.debugLine="sb.Append(columns.ToString)";
Debug.ShouldStop(4194304);
_sb.runVoidMethod ("Append",(Object)(_columns.runMethod(true,"ToString")));
 BA.debugLineNum = 88;BA.debugLine="sb.Append(\") VALUES (\")";
Debug.ShouldStop(8388608);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(") VALUES (")));
 BA.debugLineNum = 89;BA.debugLine="sb.Append(values.ToString)";
Debug.ShouldStop(16777216);
_sb.runVoidMethod ("Append",(Object)(_values.runMethod(true,"ToString")));
 BA.debugLineNum = 90;BA.debugLine="sb.Append(\")\")";
Debug.ShouldStop(33554432);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 92;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, listOfValues)";
Debug.ShouldStop(134217728);
_sql.runVoidMethod ("ExecNonQuery2",(Object)(_sb.runMethod(true,"ToString")),(Object)(_listofvalues));
 }
}Debug.locals.put("i1", _i1);
;
 BA.debugLineNum = 94;BA.debugLine="SQL.TransactionSuccessful";
Debug.ShouldStop(536870912);
_sql.runVoidMethod ("TransactionSuccessful");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e38) {
			BA.rdebugUtils.runVoidMethod("setLastException",dbutils.ba, e38.toString()); BA.debugLineNum = 96;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
dbutils.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(dbutils.__c.runMethod(false,"LastException",dbutils.ba))));
 BA.debugLineNum = 97;BA.debugLine="SQL.Rollback";
Debug.ShouldStop(1);
_sql.runVoidMethod ("Rollback");
 };
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public DB_REAL, DB_INTEGER, DB_BLOB, DB_TEXT As S";
dbutils._db_real = RemoteObject.createImmutable("");
dbutils._db_integer = RemoteObject.createImmutable("");
dbutils._db_blob = RemoteObject.createImmutable("");
dbutils._db_text = RemoteObject.createImmutable("");
 //BA.debugLineNum = 4;BA.debugLine="DB_REAL = \"REAL\"";
dbutils._db_real = BA.ObjectToString("REAL");
 //BA.debugLineNum = 5;BA.debugLine="DB_INTEGER = \"INTEGER\"";
dbutils._db_integer = BA.ObjectToString("INTEGER");
 //BA.debugLineNum = 6;BA.debugLine="DB_BLOB = \"BLOB\"";
dbutils._db_blob = BA.ObjectToString("BLOB");
 //BA.debugLineNum = 7;BA.debugLine="DB_TEXT = \"TEXT\"";
dbutils._db_text = BA.ObjectToString("TEXT");
 //BA.debugLineNum = 8;BA.debugLine="Dim HtmlCSS As String = \"table {width: 100%;borde";
dbutils._htmlcss = RemoteObject.concat(RemoteObject.createImmutable("table {width: 100%;border: 1px solid #cef;text-align: left; }"),RemoteObject.createImmutable(" th { font-weight: bold;	background-color: #acf;	border-bottom: 1px solid #cef; }"),RemoteObject.createImmutable("td,th {	padding: 4px 5px; }"),RemoteObject.createImmutable(".odd {background-color: #def; } .odd td {border-bottom: 1px solid #cef; }"),RemoteObject.createImmutable("a { text-decoration:none; color: #000;}"));
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _updaterecord(RemoteObject _sql,RemoteObject _tablename,RemoteObject _field,RemoteObject _newvalue,RemoteObject _wherefieldequals) throws Exception{
try {
		Debug.PushSubsStack("UpdateRecord (dbutils) ","dbutils",7,dbutils.ba,dbutils.mostCurrent,103);
if (RapidSub.canDelegate("updaterecord")) return b4j.example.dbutils.remoteMe.runUserSub(false, "dbutils","updaterecord", _sql, _tablename, _field, _newvalue, _wherefieldequals);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _args = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("Field", _field);
Debug.locals.put("NewValue", _newvalue);
Debug.locals.put("WhereFieldEquals", _wherefieldequals);
 BA.debugLineNum = 103;BA.debugLine="Public Sub UpdateRecord(SQL As SQL, TableName As S";
Debug.ShouldStop(64);
 BA.debugLineNum = 105;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(256);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 106;BA.debugLine="sb.Initialize";
Debug.ShouldStop(512);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 107;BA.debugLine="sb.Append(\"UPDATE \").Append(EscapeField(TableName";
Debug.ShouldStop(1024);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("UPDATE "))).runMethod(false,"Append",(Object)(_escapefield(_tablename))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" SET "))).runMethod(false,"Append",(Object)(_escapefield(_field))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" = ? WHERE ")));
 BA.debugLineNum = 109;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_wherefieldequals.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 110;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
Debug.ShouldStop(8192);
dbutils.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("WhereFieldEquals map empty!")));
 BA.debugLineNum = 111;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 113;BA.debugLine="Dim args As List";
Debug.ShouldStop(65536);
_args = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("args", _args);
 BA.debugLineNum = 114;BA.debugLine="args.Initialize";
Debug.ShouldStop(131072);
_args.runVoidMethod ("Initialize");
 BA.debugLineNum = 115;BA.debugLine="args.Add(NewValue)";
Debug.ShouldStop(262144);
_args.runVoidMethod ("Add",(Object)(_newvalue));
 BA.debugLineNum = 116;BA.debugLine="For i = 0 To WhereFieldEquals.Size - 1";
Debug.ShouldStop(524288);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_wherefieldequals.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 117;BA.debugLine="If i > 0 Then sb.Append(\" AND \")";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" AND ")));};
 BA.debugLineNum = 118;BA.debugLine="sb.Append(EscapeField(WhereFieldEquals.GetKeyAt(";
Debug.ShouldStop(2097152);
_sb.runMethod(false,"Append",(Object)(_escapefield(BA.ObjectToString(_wherefieldequals.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" = ?")));
 BA.debugLineNum = 119;BA.debugLine="args.Add(WhereFieldEquals.GetValueAt(i))";
Debug.ShouldStop(4194304);
_args.runVoidMethod ("Add",(Object)(_wherefieldequals.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 122;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
Debug.ShouldStop(33554432);
_sql.runVoidMethod ("ExecNonQuery2",(Object)(_sb.runMethod(true,"ToString")),(Object)(_args));
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updaterecord2(RemoteObject _sql,RemoteObject _tablename,RemoteObject _fields,RemoteObject _wherefieldequals) throws Exception{
try {
		Debug.PushSubsStack("UpdateRecord2 (dbutils) ","dbutils",7,dbutils.ba,dbutils.mostCurrent,127);
if (RapidSub.canDelegate("updaterecord2")) return b4j.example.dbutils.remoteMe.runUserSub(false, "dbutils","updaterecord2", _sql, _tablename, _fields, _wherefieldequals);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _args = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("Fields", _fields);
Debug.locals.put("WhereFieldEquals", _wherefieldequals);
 BA.debugLineNum = 127;BA.debugLine="Public Sub UpdateRecord2(SQL As SQL, TableName As";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 128;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_wherefieldequals.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 129;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
Debug.ShouldStop(1);
dbutils.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("WhereFieldEquals map empty!")));
 BA.debugLineNum = 130;BA.debugLine="Return";
Debug.ShouldStop(2);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 132;BA.debugLine="If Fields.Size = 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_fields.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 133;BA.debugLine="Log(\"Fields empty\")";
Debug.ShouldStop(16);
dbutils.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Fields empty")));
 BA.debugLineNum = 134;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 136;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(128);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 137;BA.debugLine="sb.Initialize";
Debug.ShouldStop(256);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 138;BA.debugLine="sb.Append(\"UPDATE \").Append(EscapeField(TableName";
Debug.ShouldStop(512);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("UPDATE "))).runMethod(false,"Append",(Object)(_escapefield(_tablename))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" SET ")));
 BA.debugLineNum = 139;BA.debugLine="Dim args As List";
Debug.ShouldStop(1024);
_args = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("args", _args);
 BA.debugLineNum = 140;BA.debugLine="args.Initialize";
Debug.ShouldStop(2048);
_args.runVoidMethod ("Initialize");
 BA.debugLineNum = 141;BA.debugLine="For i=0 To Fields.Size-1";
Debug.ShouldStop(4096);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {_fields.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14) ;_i = ((int)(0 + _i + step14))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 142;BA.debugLine="If i<>Fields.Size-1 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_fields.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 143;BA.debugLine="sb.Append(EscapeField(Fields.GetKeyAt(i))).Appe";
Debug.ShouldStop(16384);
_sb.runMethod(false,"Append",(Object)(_escapefield(BA.ObjectToString(_fields.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("=?,")));
 }else {
 BA.debugLineNum = 145;BA.debugLine="sb.Append(EscapeField(Fields.GetKeyAt(i))).Appe";
Debug.ShouldStop(65536);
_sb.runMethod(false,"Append",(Object)(_escapefield(BA.ObjectToString(_fields.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("=?")));
 };
 BA.debugLineNum = 147;BA.debugLine="args.Add(Fields.GetValueAt(i))";
Debug.ShouldStop(262144);
_args.runVoidMethod ("Add",(Object)(_fields.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 150;BA.debugLine="sb.Append(\" WHERE \")";
Debug.ShouldStop(2097152);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" WHERE ")));
 BA.debugLineNum = 151;BA.debugLine="For i = 0 To WhereFieldEquals.Size - 1";
Debug.ShouldStop(4194304);
{
final int step23 = 1;
final int limit23 = RemoteObject.solve(new RemoteObject[] {_wherefieldequals.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step23 > 0 && _i <= limit23) || (step23 < 0 && _i >= limit23) ;_i = ((int)(0 + _i + step23))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 152;BA.debugLine="If i > 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 153;BA.debugLine="sb.Append(\" AND \")";
Debug.ShouldStop(16777216);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" AND ")));
 };
 BA.debugLineNum = 155;BA.debugLine="sb.Append(EscapeField(WhereFieldEquals.GetKeyAt(";
Debug.ShouldStop(67108864);
_sb.runMethod(false,"Append",(Object)(_escapefield(BA.ObjectToString(_wherefieldequals.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))))))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" = ?")));
 BA.debugLineNum = 156;BA.debugLine="args.Add(WhereFieldEquals.GetValueAt(i))";
Debug.ShouldStop(134217728);
_args.runVoidMethod ("Add",(Object)(_wherefieldequals.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 159;BA.debugLine="SQL.ExecNonQuery2(sb.ToString, args)";
Debug.ShouldStop(1073741824);
_sql.runVoidMethod ("ExecNonQuery2",(Object)(_sb.runMethod(true,"ToString")),(Object)(_args));
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}