package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class webutils extends Object{
public static webutils mostCurrent = new webutils();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.webutils", null);
		ba.loadHtSubs(webutils.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.webutils", ba);
		}
	}
    public static Class<?> getObject() {
		return webutils.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
public static b4j.example.main _main = null;
public static b4j.example.dbutils _dbutils = null;
public static b4j.example.iosfeedback _iosfeedback = null;
public static b4j.example.iospush _iospush = null;
public static b4j.example.httputils2service _httputils2service = null;
public static b4j.example.androidpush _androidpush = null;
public static String  _escapehtml(String _raw) throws Exception{
RDebugUtils.currentModule="webutils";
if (Debug.shouldDelegate(ba, "escapehtml"))
	return (String) Debug.delegate(ba, "escapehtml", new Object[] {_raw});
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
char _c = '\0';
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Public Sub EscapeHtml(Raw As String) As String";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="For i = 0 To Raw.Length - 1";
{
final int step3 = 1;
final int limit3 = (int) (_raw.length()-1);
_i = (int) (0) ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
RDebugUtils.currentLine=4718596;
 //BA.debugLineNum = 4718596;BA.debugLine="Dim C As Char = Raw.CharAt(i)";
_c = _raw.charAt(_i);
RDebugUtils.currentLine=4718597;
 //BA.debugLineNum = 4718597;BA.debugLine="Select C";
switch (BA.switchObjectToInt(_c,BA.ObjectToChar(anywheresoftware.b4a.keywords.Common.QUOTE),BA.ObjectToChar("'"),BA.ObjectToChar("<"),BA.ObjectToChar(">"),BA.ObjectToChar("&"))) {
case 0: {
RDebugUtils.currentLine=4718599;
 //BA.debugLineNum = 4718599;BA.debugLine="sb.Append(\"&quot;\")";
_sb.Append("&quot;");
 break; }
case 1: {
RDebugUtils.currentLine=4718601;
 //BA.debugLineNum = 4718601;BA.debugLine="sb.Append(\"&#39;\")";
_sb.Append("&#39;");
 break; }
case 2: {
RDebugUtils.currentLine=4718603;
 //BA.debugLineNum = 4718603;BA.debugLine="sb.Append(\"&lt;\")";
_sb.Append("&lt;");
 break; }
case 3: {
RDebugUtils.currentLine=4718605;
 //BA.debugLineNum = 4718605;BA.debugLine="sb.Append(\"&gt;\")";
_sb.Append("&gt;");
 break; }
case 4: {
RDebugUtils.currentLine=4718607;
 //BA.debugLineNum = 4718607;BA.debugLine="sb.Append(\"&amp;\")";
_sb.Append("&amp;");
 break; }
default: {
RDebugUtils.currentLine=4718609;
 //BA.debugLineNum = 4718609;BA.debugLine="sb.Append(C)";
_sb.Append(BA.ObjectToString(_c));
 break; }
}
;
 }
};
RDebugUtils.currentLine=4718612;
 //BA.debugLineNum = 4718612;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=4718613;
 //BA.debugLineNum = 4718613;BA.debugLine="End Sub";
return "";
}
public static String  _init() throws Exception{
RDebugUtils.currentModule="webutils";
if (Debug.shouldDelegate(ba, "init"))
	return (String) Debug.delegate(ba, "init", null);
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Public Sub init";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="bc.LittleEndian = True";
_bc.setLittleEndian(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="End Sub";
return "";
}
public static byte[]  _readbytesfromstream(anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in,int _length) throws Exception{
RDebugUtils.currentModule="webutils";
if (Debug.shouldDelegate(ba, "readbytesfromstream"))
	return (byte[]) Debug.delegate(ba, "readbytesfromstream", new Object[] {_in,_length});
byte[] _b = null;
int _count = 0;
int _read = 0;
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Sub ReadBytesFromStream(In As InputStream, Length";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="If Length > 5000 Then";
if (_length>5000) { 
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="Log(\"Error reading from stream\")";
anywheresoftware.b4a.keywords.Common.Log("Error reading from stream");
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="Return Null";
if (true) return (byte[])(anywheresoftware.b4a.keywords.Common.Null);
 };
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="Dim b(Length) As Byte";
_b = new byte[_length];
;
RDebugUtils.currentLine=4980742;
 //BA.debugLineNum = 4980742;BA.debugLine="Dim count As Int = 0";
_count = (int) (0);
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="Do While count < Length";
while (_count<_length) {
RDebugUtils.currentLine=4980744;
 //BA.debugLineNum = 4980744;BA.debugLine="Dim read As Int = In.ReadBytes(b, count, Length";
_read = _in.ReadBytes(_b,_count,(int) (_length-_count));
RDebugUtils.currentLine=4980745;
 //BA.debugLineNum = 4980745;BA.debugLine="If read <= 0 Then";
if (_read<=0) { 
RDebugUtils.currentLine=4980746;
 //BA.debugLineNum = 4980746;BA.debugLine="Log(\"Error reading from stream.\")";
anywheresoftware.b4a.keywords.Common.Log("Error reading from stream.");
RDebugUtils.currentLine=4980747;
 //BA.debugLineNum = 4980747;BA.debugLine="Return Null";
if (true) return (byte[])(anywheresoftware.b4a.keywords.Common.Null);
 };
RDebugUtils.currentLine=4980749;
 //BA.debugLineNum = 4980749;BA.debugLine="count = count + read";
_count = (int) (_count+_read);
 }
;
RDebugUtils.currentLine=4980751;
 //BA.debugLineNum = 4980751;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=4980752;
 //BA.debugLineNum = 4980752;BA.debugLine="End Sub";
return null;
}
public static String  _readstring(anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in) throws Exception{
RDebugUtils.currentModule="webutils";
if (Debug.shouldDelegate(ba, "readstring"))
	return (String) Debug.delegate(ba, "readstring", new Object[] {_in});
int _len = 0;
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub ReadString(In As InputStream) As String";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Dim len As Int = bc.IntsFromBytes(ReadBytesFromSt";
_len = _bc.IntsFromBytes(_readbytesfromstream(_in,(int) (4)))[(int) (0)];
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Return BytesToString(ReadBytesFromStream(In, len)";
if (true) return anywheresoftware.b4a.keywords.Common.BytesToString(_readbytesfromstream(_in,_len),(int) (0),_len,"UTF8");
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="End Sub";
return "";
}
public static String  _redirectto(anywheresoftware.b4j.object.WebSocket _ws,String _targeturl) throws Exception{
RDebugUtils.currentModule="webutils";
if (Debug.shouldDelegate(ba, "redirectto"))
	return (String) Debug.delegate(ba, "redirectto", new Object[] {_ws,_targeturl});
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub RedirectTo(ws As WebSocket, TargetUrl A";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="ws.Eval(\"window.location = arguments[0]\", Array A";
_ws.Eval("window.location = arguments[0]",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_targeturl)}));
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="End Sub";
return "";
}
public static String  _replacemap(String _base,anywheresoftware.b4a.objects.collections.Map _replacements) throws Exception{
RDebugUtils.currentModule="webutils";
if (Debug.shouldDelegate(ba, "replacemap"))
	return (String) Debug.delegate(ba, "replacemap", new Object[] {_base,_replacements});
anywheresoftware.b4a.keywords.StringBuilderWrapper _pattern = null;
String _k = "";
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _result = null;
int _lastindex = 0;
String _replace = "";
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub ReplaceMap(Base As String, Replacements";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Dim pattern As StringBuilder";
_pattern = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="pattern.Initialize";
_pattern.Initialize();
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="For Each k As String In Replacements.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _replacements.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="If pattern.Length > 0 Then pattern.Append(\"|\")";
if (_pattern.getLength()>0) { 
_pattern.Append("|");};
RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="pattern.Append(\"\\$\").Append(k).Append(\"\\$\")";
_pattern.Append("\\$").Append(_k).Append("\\$");
 }
};
RDebugUtils.currentLine=4784135;
 //BA.debugLineNum = 4784135;BA.debugLine="Dim m As Matcher = Regex.Matcher(pattern.ToString";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher(_pattern.ToString(),_base);
RDebugUtils.currentLine=4784136;
 //BA.debugLineNum = 4784136;BA.debugLine="Dim result As StringBuilder";
_result = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=4784137;
 //BA.debugLineNum = 4784137;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=4784138;
 //BA.debugLineNum = 4784138;BA.debugLine="Dim lastIndex As Int";
_lastindex = 0;
RDebugUtils.currentLine=4784139;
 //BA.debugLineNum = 4784139;BA.debugLine="Do While m.Find";
while (_m.Find()) {
RDebugUtils.currentLine=4784140;
 //BA.debugLineNum = 4784140;BA.debugLine="result.Append(Base.SubString2(lastIndex, m.GetSt";
_result.Append(_base.substring(_lastindex,_m.GetStart((int) (0))));
RDebugUtils.currentLine=4784141;
 //BA.debugLineNum = 4784141;BA.debugLine="Dim replace As String = Replacements.Get(m.Match";
_replace = BA.ObjectToString(_replacements.Get((Object)(_m.getMatch().substring((int) (1),(int) (_m.getMatch().length()-1)))));
RDebugUtils.currentLine=4784142;
 //BA.debugLineNum = 4784142;BA.debugLine="If m.Match.ToLowerCase.StartsWith(\"$h_\") Then re";
if (_m.getMatch().toLowerCase().startsWith("$h_")) { 
_replace = _escapehtml(_replace);};
RDebugUtils.currentLine=4784143;
 //BA.debugLineNum = 4784143;BA.debugLine="result.Append(replace)";
_result.Append(_replace);
RDebugUtils.currentLine=4784144;
 //BA.debugLineNum = 4784144;BA.debugLine="lastIndex = m.GetEnd(0)";
_lastindex = _m.GetEnd((int) (0));
 }
;
RDebugUtils.currentLine=4784146;
 //BA.debugLineNum = 4784146;BA.debugLine="If lastIndex < Base.Length Then result.Append(Bas";
if (_lastindex<_base.length()) { 
_result.Append(_base.substring(_lastindex));};
RDebugUtils.currentLine=4784147;
 //BA.debugLineNum = 4784147;BA.debugLine="Return result.ToString";
if (true) return _result.ToString();
RDebugUtils.currentLine=4784148;
 //BA.debugLineNum = 4784148;BA.debugLine="End Sub";
return "";
}
}