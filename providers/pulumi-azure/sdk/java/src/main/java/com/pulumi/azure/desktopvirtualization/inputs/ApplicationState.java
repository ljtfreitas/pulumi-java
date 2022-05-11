// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.desktopvirtualization.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationState extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationState Empty = new ApplicationState();

    /**
     * Resource ID for a Virtual Desktop Application Group to associate with the
     * Virtual Desktop Application. Changing the ID forces a new resource to be created.
     * 
     */
    @Import(name="applicationGroupId")
    private @Nullable Output<String> applicationGroupId;

    /**
     * @return Resource ID for a Virtual Desktop Application Group to associate with the
     * Virtual Desktop Application. Changing the ID forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> applicationGroupId() {
        return Optional.ofNullable(this.applicationGroupId);
    }

    /**
     * Specifies whether this published application can be launched with command line arguments provided by the client, command line arguments specified at publish time, or no command line arguments at all. Possible values include: `DoNotAllow`, `Allow`, `Require`.
     * 
     */
    @Import(name="commandLineArgumentPolicy")
    private @Nullable Output<String> commandLineArgumentPolicy;

    /**
     * @return Specifies whether this published application can be launched with command line arguments provided by the client, command line arguments specified at publish time, or no command line arguments at all. Possible values include: `DoNotAllow`, `Allow`, `Require`.
     * 
     */
    public Optional<Output<String>> commandLineArgumentPolicy() {
        return Optional.ofNullable(this.commandLineArgumentPolicy);
    }

    /**
     * Command Line Arguments for Virtual Desktop Application.
     * 
     */
    @Import(name="commandLineArguments")
    private @Nullable Output<String> commandLineArguments;

    /**
     * @return Command Line Arguments for Virtual Desktop Application.
     * 
     */
    public Optional<Output<String>> commandLineArguments() {
        return Optional.ofNullable(this.commandLineArguments);
    }

    /**
     * Option to set a description for the Virtual Desktop Application.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Option to set a description for the Virtual Desktop Application.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Option to set a friendly name for the Virtual Desktop Application.
     * 
     */
    @Import(name="friendlyName")
    private @Nullable Output<String> friendlyName;

    /**
     * @return Option to set a friendly name for the Virtual Desktop Application.
     * 
     */
    public Optional<Output<String>> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }

    /**
     * The index of the icon you wish to use.
     * 
     */
    @Import(name="iconIndex")
    private @Nullable Output<Integer> iconIndex;

    /**
     * @return The index of the icon you wish to use.
     * 
     */
    public Optional<Output<Integer>> iconIndex() {
        return Optional.ofNullable(this.iconIndex);
    }

    /**
     * Specifies the path for an icon which will be used for this Virtual Desktop Application.
     * 
     */
    @Import(name="iconPath")
    private @Nullable Output<String> iconPath;

    /**
     * @return Specifies the path for an icon which will be used for this Virtual Desktop Application.
     * 
     */
    public Optional<Output<String>> iconPath() {
        return Optional.ofNullable(this.iconPath);
    }

    /**
     * The name of the Virtual Desktop Application. Changing the name forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Virtual Desktop Application. Changing the name forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The file path location of the app on the Virtual Desktop OS.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The file path location of the app on the Virtual Desktop OS.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Specifies whether to show the RemoteApp program in the RD Web Access server.
     * 
     */
    @Import(name="showInPortal")
    private @Nullable Output<Boolean> showInPortal;

    /**
     * @return Specifies whether to show the RemoteApp program in the RD Web Access server.
     * 
     */
    public Optional<Output<Boolean>> showInPortal() {
        return Optional.ofNullable(this.showInPortal);
    }

    private ApplicationState() {}

    private ApplicationState(ApplicationState $) {
        this.applicationGroupId = $.applicationGroupId;
        this.commandLineArgumentPolicy = $.commandLineArgumentPolicy;
        this.commandLineArguments = $.commandLineArguments;
        this.description = $.description;
        this.friendlyName = $.friendlyName;
        this.iconIndex = $.iconIndex;
        this.iconPath = $.iconPath;
        this.name = $.name;
        this.path = $.path;
        this.showInPortal = $.showInPortal;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationState $;

        public Builder() {
            $ = new ApplicationState();
        }

        public Builder(ApplicationState defaults) {
            $ = new ApplicationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationGroupId Resource ID for a Virtual Desktop Application Group to associate with the
         * Virtual Desktop Application. Changing the ID forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder applicationGroupId(@Nullable Output<String> applicationGroupId) {
            $.applicationGroupId = applicationGroupId;
            return this;
        }

        /**
         * @param applicationGroupId Resource ID for a Virtual Desktop Application Group to associate with the
         * Virtual Desktop Application. Changing the ID forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder applicationGroupId(String applicationGroupId) {
            return applicationGroupId(Output.of(applicationGroupId));
        }

        /**
         * @param commandLineArgumentPolicy Specifies whether this published application can be launched with command line arguments provided by the client, command line arguments specified at publish time, or no command line arguments at all. Possible values include: `DoNotAllow`, `Allow`, `Require`.
         * 
         * @return builder
         * 
         */
        public Builder commandLineArgumentPolicy(@Nullable Output<String> commandLineArgumentPolicy) {
            $.commandLineArgumentPolicy = commandLineArgumentPolicy;
            return this;
        }

        /**
         * @param commandLineArgumentPolicy Specifies whether this published application can be launched with command line arguments provided by the client, command line arguments specified at publish time, or no command line arguments at all. Possible values include: `DoNotAllow`, `Allow`, `Require`.
         * 
         * @return builder
         * 
         */
        public Builder commandLineArgumentPolicy(String commandLineArgumentPolicy) {
            return commandLineArgumentPolicy(Output.of(commandLineArgumentPolicy));
        }

        /**
         * @param commandLineArguments Command Line Arguments for Virtual Desktop Application.
         * 
         * @return builder
         * 
         */
        public Builder commandLineArguments(@Nullable Output<String> commandLineArguments) {
            $.commandLineArguments = commandLineArguments;
            return this;
        }

        /**
         * @param commandLineArguments Command Line Arguments for Virtual Desktop Application.
         * 
         * @return builder
         * 
         */
        public Builder commandLineArguments(String commandLineArguments) {
            return commandLineArguments(Output.of(commandLineArguments));
        }

        /**
         * @param description Option to set a description for the Virtual Desktop Application.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Option to set a description for the Virtual Desktop Application.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param friendlyName Option to set a friendly name for the Virtual Desktop Application.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            $.friendlyName = friendlyName;
            return this;
        }

        /**
         * @param friendlyName Option to set a friendly name for the Virtual Desktop Application.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(String friendlyName) {
            return friendlyName(Output.of(friendlyName));
        }

        /**
         * @param iconIndex The index of the icon you wish to use.
         * 
         * @return builder
         * 
         */
        public Builder iconIndex(@Nullable Output<Integer> iconIndex) {
            $.iconIndex = iconIndex;
            return this;
        }

        /**
         * @param iconIndex The index of the icon you wish to use.
         * 
         * @return builder
         * 
         */
        public Builder iconIndex(Integer iconIndex) {
            return iconIndex(Output.of(iconIndex));
        }

        /**
         * @param iconPath Specifies the path for an icon which will be used for this Virtual Desktop Application.
         * 
         * @return builder
         * 
         */
        public Builder iconPath(@Nullable Output<String> iconPath) {
            $.iconPath = iconPath;
            return this;
        }

        /**
         * @param iconPath Specifies the path for an icon which will be used for this Virtual Desktop Application.
         * 
         * @return builder
         * 
         */
        public Builder iconPath(String iconPath) {
            return iconPath(Output.of(iconPath));
        }

        /**
         * @param name The name of the Virtual Desktop Application. Changing the name forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Virtual Desktop Application. Changing the name forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param path The file path location of the app on the Virtual Desktop OS.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The file path location of the app on the Virtual Desktop OS.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param showInPortal Specifies whether to show the RemoteApp program in the RD Web Access server.
         * 
         * @return builder
         * 
         */
        public Builder showInPortal(@Nullable Output<Boolean> showInPortal) {
            $.showInPortal = showInPortal;
            return this;
        }

        /**
         * @param showInPortal Specifies whether to show the RemoteApp program in the RD Web Access server.
         * 
         * @return builder
         * 
         */
        public Builder showInPortal(Boolean showInPortal) {
            return showInPortal(Output.of(showInPortal));
        }

        public ApplicationState build() {
            return $;
        }
    }

}
