package app.revanced.patches.tiktok.misc.loginfallback.fingerprints

import app.revanced.patcher.extensions.or
import app.revanced.patcher.fingerprint.method.impl.MethodFingerprint
import org.jf.dexlib2.AccessFlags

object GoogleAuthAvailableFingerprint : MethodFingerprint(
    returnType = "Z",
    access = AccessFlags.PUBLIC or AccessFlags.FINAL,
    parameters = listOf(),
    customFingerprint = { methodDef ->
        methodDef.definingClass == "Lcom/bytedance/lobby/google/GoogleAuth;"
    }
)