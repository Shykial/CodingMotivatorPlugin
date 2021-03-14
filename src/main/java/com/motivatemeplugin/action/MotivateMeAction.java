package com.motivatemeplugin.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

public class MotivateMeAction extends AnAction {

    @Override
    public void update(AnActionEvent e) {
        // Using the event, evaluate the context, and enable or disable the action.
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {

        // Using the event, create and show a dialog
        Project currentProject = event.getProject();
        String[] motivatingMessages = {"You can do it!", "You're the best!",
                "It doesn't matter how many times you fall, what does matter is how many times you get up!",
                "If you think you're unlucky - remember that some people still code in C#",
                "We know you have no friends, let caffeine be the first one!",
                "Programming is just like sex, one mistake and you have to support it for the rest of your life!"};

        String motivationalMessage = (motivatingMessages[(int) (Math.random() * (motivatingMessages.length))]);
        String dlgTitle = event.getPresentation().getDescription();

        Messages.showMessageDialog(currentProject, motivationalMessage, dlgTitle, Messages.getInformationIcon());
    }
}
