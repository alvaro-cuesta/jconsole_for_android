package org.dykman.jn.android.app;
public class ActivityGroup extends android.app.ActivityGroup{
protected org.dykman.j.JInterface jInterface = null;
protected java.lang.String jlocale = null;
protected java.lang.String jchildid = null;
protected java.lang.String jchildidx = null;
protected java.util.ArrayList jnOverrideList = null;
protected void jparseargs (java.lang.String jlocale, java.lang.String jchildid, java.lang.String joverride ) { this.jlocale = jlocale; this.jchildid = jchildid; if (jchildid != null && jchildid.length() > 0) jchildidx = jchildid + "_"; else jchildidx = ""; if (joverride != null && joverride.length() > 0) { java.lang.String[] ss = joverride.split(" "); for (int i = 0; i < ss.length; i++) setjnOverride(ss[i]); } }
public void clearjnOverride () { jnOverrideList.clear (); }
public void setjnOverride (java.lang.String arg1 ) { if (!testjnOverride (arg1)) jnOverrideList.add (arg1); }
public void setjnOverride (java.lang.String arg1, boolean arg2 ) { if (arg2) { if (!testjnOverride (arg1)) jnOverrideList.add (arg1); } else jnOverrideList.remove (arg1); }
public boolean testjnOverride (java.lang.String arg1 ) { return jnOverrideList.contains (arg1); }
public ActivityGroup(String jlocale,String jchildid,String joverride ){ super(); jnOverrideList = new java.util.ArrayList(); jparseargs( jlocale, jchildid, joverride ); jInterface = org.dykman.j.android.JConsoleApp.theApp.jInterface; if (testjnOverride( "jcreate" )) jInterface.Jnido( this, jchildidx + "jcreate_" + jlocale + "_", null ); }
public ActivityGroup(boolean arg1, java.lang.String jlocale,String jchildid,String joverride ) { super( arg1); jnOverrideList = new java.util.ArrayList(); jparseargs( jlocale, jchildid, joverride ); jInterface = org.dykman.j.android.JConsoleApp.theApp.jInterface; if (testjnOverride( "jcreate" )) jInterface.Jnido( this, jchildidx + "jcreate_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
@Override protected void onCreate(android.os.Bundle arg1) { if (!testjnOverride( "onCreate" )) { super.onCreate( arg1); return; } else super.onCreate( arg1); jInterface.Jnido( this, jchildidx + "onCreate_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
@Override protected void onResume(){ if (!testjnOverride( "onResume" )) { super.onResume(); return; } else super.onResume(); jInterface.Jnido( this, jchildidx + "onResume_" + jlocale + "_", null ); }
@Override protected void onSaveInstanceState(android.os.Bundle arg1) { if (!testjnOverride( "onSaveInstanceState" )) { super.onSaveInstanceState( arg1); return; } jInterface.Jnido( this, jchildidx + "onSaveInstanceState_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
@Override protected void onPause(){ if (!testjnOverride( "onPause" )) { super.onPause(); return; } else super.onPause(); jInterface.Jnido( this, jchildidx + "onPause_" + jlocale + "_", null ); }
@Override protected void onStop(){ if (!testjnOverride( "onStop" )) { super.onStop(); return; } jInterface.Jnido( this, jchildidx + "onStop_" + jlocale + "_", null ); }
@Override protected void onDestroy(){ if (!testjnOverride( "onDestroy" )) { super.onDestroy(); return; } else super.onDestroy(); jInterface.Jnido( this, jchildidx + "onDestroy_" + jlocale + "_", null ); }
@Override public android.app.Activity getCurrentActivity(){ if (!testjnOverride( "getCurrentActivity" )) return super.getCurrentActivity(); return (android.app.Activity) jInterface.Jnido( this, jchildidx + "getCurrentActivity_" + jlocale + "_", null ); }
}
