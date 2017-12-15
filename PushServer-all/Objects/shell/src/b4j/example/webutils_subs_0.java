package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class webutils_subs_0 {


public static RemoteObject  _escapehtml(RemoteObject _raw) throws Exception{
try {
		Debug.PushSubsStack("EscapeHtml (webutils) ","webutils",7,webutils.ba,webutils.mostCurrent,10);
if (RapidSub.canDelegate("escapehtml")) return b4j.example.webutils.remoteMe.runUserSub(false, "webutils","escapehtml", _raw);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
RemoteObject _c = RemoteObject.createImmutable('\0');
Debug.locals.put("Raw", _raw);
 BA.debugLineNum = 10;BA.debugLine="Public Sub EscapeHtml(Raw As String) As String";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(1024);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 12;BA.debugLine="sb.Initialize";
Debug.ShouldStop(2048);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 13;BA.debugLine="For i = 0 To Raw.Length - 1";
Debug.ShouldStop(4096);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_raw.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 14;BA.debugLine="Dim C As Char = Raw.CharAt(i)";
Debug.ShouldStop(8192);
_c = _raw.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("C", _c);Debug.locals.put("C", _c);
 BA.debugLineNum = 15;BA.debugLine="Select C";
Debug.ShouldStop(16384);
switch (BA.switchObjectToInt(_c,BA.ObjectToChar(webutils.__c.getField(true,"QUOTE")),BA.ObjectToChar("'"),BA.ObjectToChar("<"),BA.ObjectToChar(">"),BA.ObjectToChar("&"))) {
case 0: {
 BA.debugLineNum = 17;BA.debugLine="sb.Append(\"&quot;\")";
Debug.ShouldStop(65536);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("&quot;")));
 break; }
case 1: {
 BA.debugLineNum = 19;BA.debugLine="sb.Append(\"&#39;\")";
Debug.ShouldStop(262144);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("&#39;")));
 break; }
case 2: {
 BA.debugLineNum = 21;BA.debugLine="sb.Append(\"&lt;\")";
Debug.ShouldStop(1048576);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("&lt;")));
 break; }
case 3: {
 BA.debugLineNum = 23;BA.debugLine="sb.Append(\"&gt;\")";
Debug.ShouldStop(4194304);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("&gt;")));
 break; }
case 4: {
 BA.debugLineNum = 25;BA.debugLine="sb.Append(\"&amp;\")";
Debug.ShouldStop(16777216);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("&amp;")));
 break; }
default: {
 BA.debugLineNum = 27;BA.debugLine="sb.Append(C)";
Debug.ShouldStop(67108864);
_sb.runVoidMethod ("Append",(Object)(BA.ObjectToString(_c)));
 break; }
}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 30;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(536870912);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _init() throws Exception{
try {
		Debug.PushSubsStack("init (webutils) ","webutils",7,webutils.ba,webutils.mostCurrent,6);
if (RapidSub.canDelegate("init")) return b4j.example.webutils.remoteMe.runUserSub(false, "webutils","init");
 BA.debugLineNum = 6;BA.debugLine="Public Sub init";
Debug.ShouldStop(32);
 BA.debugLineNum = 7;BA.debugLine="bc.LittleEndian = True";
Debug.ShouldStop(64);
webutils._bc.runMethod(true,"setLittleEndian",webutils.__c.getField(true,"True"));
 BA.debugLineNum = 8;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
 //BA.debugLineNum = 3;BA.debugLine="Public bc As ByteConverter";
webutils._bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _readbytesfromstream(RemoteObject _in,RemoteObject _length) throws Exception{
try {
		Debug.PushSubsStack("ReadBytesFromStream (webutils) ","webutils",7,webutils.ba,webutils.mostCurrent,65);
if (RapidSub.canDelegate("readbytesfromstream")) return b4j.example.webutils.remoteMe.runUserSub(false, "webutils","readbytesfromstream", _in, _length);
RemoteObject _b = null;
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _read = RemoteObject.createImmutable(0);
Debug.locals.put("In", _in);
Debug.locals.put("Length", _length);
 BA.debugLineNum = 65;BA.debugLine="Sub ReadBytesFromStream(In As InputStream, Length";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="If Length > 5000 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_length,BA.numberCast(double.class, 5000))) { 
 BA.debugLineNum = 67;BA.debugLine="Log(\"Error reading from stream\")";
Debug.ShouldStop(4);
webutils.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Error reading from stream")));
 BA.debugLineNum = 68;BA.debugLine="Return Null";
Debug.ShouldStop(8);
if (true) return (webutils.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 70;BA.debugLine="Dim b(Length) As Byte";
Debug.ShouldStop(32);
_b = RemoteObject.createNewArray ("byte", new int[] {_length.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("b", _b);
 BA.debugLineNum = 71;BA.debugLine="Dim count As Int = 0";
Debug.ShouldStop(64);
_count = BA.numberCast(int.class, 0);Debug.locals.put("count", _count);Debug.locals.put("count", _count);
 BA.debugLineNum = 72;BA.debugLine="Do While count < Length";
Debug.ShouldStop(128);
while (RemoteObject.solveBoolean("<",_count,BA.numberCast(double.class, _length))) {
 BA.debugLineNum = 73;BA.debugLine="Dim read As Int = In.ReadBytes(b, count, Length";
Debug.ShouldStop(256);
_read = _in.runMethod(true,"ReadBytes",(Object)(_b),(Object)(_count),(Object)(RemoteObject.solve(new RemoteObject[] {_length,_count}, "-",1, 1)));Debug.locals.put("read", _read);Debug.locals.put("read", _read);
 BA.debugLineNum = 74;BA.debugLine="If read <= 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("k",_read,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 75;BA.debugLine="Log(\"Error reading from stream.\")";
Debug.ShouldStop(1024);
webutils.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Error reading from stream.")));
 BA.debugLineNum = 76;BA.debugLine="Return Null";
Debug.ShouldStop(2048);
if (true) return (webutils.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 78;BA.debugLine="count = count + read";
Debug.ShouldStop(8192);
_count = RemoteObject.solve(new RemoteObject[] {_count,_read}, "+",1, 1);Debug.locals.put("count", _count);
 }
;
 BA.debugLineNum = 80;BA.debugLine="Return b";
Debug.ShouldStop(32768);
if (true) return _b;
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readstring(RemoteObject _in) throws Exception{
try {
		Debug.PushSubsStack("ReadString (webutils) ","webutils",7,webutils.ba,webutils.mostCurrent,58);
if (RapidSub.canDelegate("readstring")) return b4j.example.webutils.remoteMe.runUserSub(false, "webutils","readstring", _in);
RemoteObject _len = RemoteObject.createImmutable(0);
Debug.locals.put("In", _in);
 BA.debugLineNum = 58;BA.debugLine="Public Sub ReadString(In As InputStream) As String";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="Dim len As Int = bc.IntsFromBytes(ReadBytesFromSt";
Debug.ShouldStop(67108864);
_len = webutils._bc.runMethod(false,"IntsFromBytes",(Object)(_readbytesfromstream(_in,BA.numberCast(int.class, 4)))).getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("len", _len);Debug.locals.put("len", _len);
 BA.debugLineNum = 60;BA.debugLine="Return BytesToString(ReadBytesFromStream(In, len)";
Debug.ShouldStop(134217728);
if (true) return webutils.__c.runMethod(true,"BytesToString",(Object)(_readbytesfromstream(_in,_len)),(Object)(BA.numberCast(int.class, 0)),(Object)(_len),(Object)(RemoteObject.createImmutable("UTF8")));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _redirectto(RemoteObject _ws,RemoteObject _targeturl) throws Exception{
try {
		Debug.PushSubsStack("RedirectTo (webutils) ","webutils",7,webutils.ba,webutils.mostCurrent,55);
if (RapidSub.canDelegate("redirectto")) return b4j.example.webutils.remoteMe.runUserSub(false, "webutils","redirectto", _ws, _targeturl);
Debug.locals.put("ws", _ws);
Debug.locals.put("TargetUrl", _targeturl);
 BA.debugLineNum = 55;BA.debugLine="Public Sub RedirectTo(ws As WebSocket, TargetUrl A";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="ws.Eval(\"window.location = arguments[0]\", Array A";
Debug.ShouldStop(8388608);
_ws.runVoidMethod ("Eval",(Object)(BA.ObjectToString("window.location = arguments[0]")),(Object)(webutils.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_targeturl)})))));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _replacemap(RemoteObject _base,RemoteObject _replacements) throws Exception{
try {
		Debug.PushSubsStack("ReplaceMap (webutils) ","webutils",7,webutils.ba,webutils.mostCurrent,33);
if (RapidSub.canDelegate("replacemap")) return b4j.example.webutils.remoteMe.runUserSub(false, "webutils","replacemap", _base, _replacements);
RemoteObject _pattern = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _lastindex = RemoteObject.createImmutable(0);
RemoteObject _replace = RemoteObject.createImmutable("");
Debug.locals.put("Base", _base);
Debug.locals.put("Replacements", _replacements);
 BA.debugLineNum = 33;BA.debugLine="Public Sub ReplaceMap(Base As String, Replacements";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="Dim pattern As StringBuilder";
Debug.ShouldStop(2);
_pattern = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("pattern", _pattern);
 BA.debugLineNum = 35;BA.debugLine="pattern.Initialize";
Debug.ShouldStop(4);
_pattern.runVoidMethod ("Initialize");
 BA.debugLineNum = 36;BA.debugLine="For Each k As String In Replacements.Keys";
Debug.ShouldStop(8);
{
final RemoteObject group3 = _replacements.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 37;BA.debugLine="If pattern.Length > 0 Then pattern.Append(\"|\")";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",_pattern.runMethod(true,"getLength"),BA.numberCast(double.class, 0))) { 
_pattern.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("|")));};
 BA.debugLineNum = 38;BA.debugLine="pattern.Append(\"\\$\").Append(k).Append(\"\\$\")";
Debug.ShouldStop(32);
_pattern.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("\\$"))).runMethod(false,"Append",(Object)(_k)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("\\$")));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 40;BA.debugLine="Dim m As Matcher = Regex.Matcher(pattern.ToString";
Debug.ShouldStop(128);
_m = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
_m = webutils.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(_pattern.runMethod(true,"ToString")),(Object)(_base));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 41;BA.debugLine="Dim result As StringBuilder";
Debug.ShouldStop(256);
_result = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("result", _result);
 BA.debugLineNum = 42;BA.debugLine="result.Initialize";
Debug.ShouldStop(512);
_result.runVoidMethod ("Initialize");
 BA.debugLineNum = 43;BA.debugLine="Dim lastIndex As Int";
Debug.ShouldStop(1024);
_lastindex = RemoteObject.createImmutable(0);Debug.locals.put("lastIndex", _lastindex);
 BA.debugLineNum = 44;BA.debugLine="Do While m.Find";
Debug.ShouldStop(2048);
while (_m.runMethod(true,"Find").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 45;BA.debugLine="result.Append(Base.SubString2(lastIndex, m.GetSt";
Debug.ShouldStop(4096);
_result.runVoidMethod ("Append",(Object)(_base.runMethod(true,"substring",(Object)(_lastindex),(Object)(_m.runMethod(true,"GetStart",(Object)(BA.numberCast(int.class, 0)))))));
 BA.debugLineNum = 46;BA.debugLine="Dim replace As String = Replacements.Get(m.Match";
Debug.ShouldStop(8192);
_replace = BA.ObjectToString(_replacements.runMethod(false,"Get",(Object)((_m.runMethod(true,"getMatch").runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_m.runMethod(true,"getMatch").runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1)))))));Debug.locals.put("replace", _replace);Debug.locals.put("replace", _replace);
 BA.debugLineNum = 47;BA.debugLine="If m.Match.ToLowerCase.StartsWith(\"$h_\") Then re";
Debug.ShouldStop(16384);
if (_m.runMethod(true,"getMatch").runMethod(true,"toLowerCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("$h_"))).<Boolean>get().booleanValue()) { 
_replace = _escapehtml(_replace);Debug.locals.put("replace", _replace);};
 BA.debugLineNum = 48;BA.debugLine="result.Append(replace)";
Debug.ShouldStop(32768);
_result.runVoidMethod ("Append",(Object)(_replace));
 BA.debugLineNum = 49;BA.debugLine="lastIndex = m.GetEnd(0)";
Debug.ShouldStop(65536);
_lastindex = _m.runMethod(true,"GetEnd",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("lastIndex", _lastindex);
 }
;
 BA.debugLineNum = 51;BA.debugLine="If lastIndex < Base.Length Then result.Append(Bas";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("<",_lastindex,BA.numberCast(double.class, _base.runMethod(true,"length")))) { 
_result.runVoidMethod ("Append",(Object)(_base.runMethod(true,"substring",(Object)(_lastindex))));};
 BA.debugLineNum = 52;BA.debugLine="Return result.ToString";
Debug.ShouldStop(524288);
if (true) return _result.runMethod(true,"ToString");
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}