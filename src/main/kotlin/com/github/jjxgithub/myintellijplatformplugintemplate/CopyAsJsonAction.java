package com.github.jjxgithub.myintellijplatformplugintemplate;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;

public class CopyAsJsonAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        // 获取项目
        Project project = e.getData(PlatformDataKeys.PROJECT);
        // 获取Psi文件
        PsiFile psiFile = e.getData(CommonDataKeys.PSI_FILE);
        // 获取当前编辑的文件
        Editor editor = e.getData(CommonDataKeys.EDITOR);
    }
}
