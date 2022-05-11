// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.azure.containerservice.inputs.RegistryTaskSourceTriggerAuthenticationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegistryTaskSourceTriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegistryTaskSourceTriggerArgs Empty = new RegistryTaskSourceTriggerArgs();

    /**
     * A `authentication` block as defined above.
     * 
     */
    @Import(name="authentication")
    private @Nullable Output<RegistryTaskSourceTriggerAuthenticationArgs> authentication;

    /**
     * @return A `authentication` block as defined above.
     * 
     */
    public Optional<Output<RegistryTaskSourceTriggerAuthenticationArgs>> authentication() {
        return Optional.ofNullable(this.authentication);
    }

    /**
     * The branch name of the source code.
     * 
     */
    @Import(name="branch")
    private @Nullable Output<String> branch;

    /**
     * @return The branch name of the source code.
     * 
     */
    public Optional<Output<String>> branch() {
        return Optional.ofNullable(this.branch);
    }

    /**
     * Should the trigger be enabled? Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Should the trigger be enabled? Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Specifies a list of source events corresponding to the trigger. Possible values are `commit` and `pullrequest`.
     * 
     */
    @Import(name="events", required=true)
    private Output<List<String>> events;

    /**
     * @return Specifies a list of source events corresponding to the trigger. Possible values are `commit` and `pullrequest`.
     * 
     */
    public Output<List<String>> events() {
        return this.events;
    }

    /**
     * The name which should be used for this trigger.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name which should be used for this trigger.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The full URL to the source code repository.
     * 
     */
    @Import(name="repositoryUrl", required=true)
    private Output<String> repositoryUrl;

    /**
     * @return The full URL to the source code repository.
     * 
     */
    public Output<String> repositoryUrl() {
        return this.repositoryUrl;
    }

    /**
     * The type of the source control service. Possible values are `Github` and `VisualStudioTeamService`.
     * 
     */
    @Import(name="sourceType", required=true)
    private Output<String> sourceType;

    /**
     * @return The type of the source control service. Possible values are `Github` and `VisualStudioTeamService`.
     * 
     */
    public Output<String> sourceType() {
        return this.sourceType;
    }

    private RegistryTaskSourceTriggerArgs() {}

    private RegistryTaskSourceTriggerArgs(RegistryTaskSourceTriggerArgs $) {
        this.authentication = $.authentication;
        this.branch = $.branch;
        this.enabled = $.enabled;
        this.events = $.events;
        this.name = $.name;
        this.repositoryUrl = $.repositoryUrl;
        this.sourceType = $.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistryTaskSourceTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistryTaskSourceTriggerArgs $;

        public Builder() {
            $ = new RegistryTaskSourceTriggerArgs();
        }

        public Builder(RegistryTaskSourceTriggerArgs defaults) {
            $ = new RegistryTaskSourceTriggerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authentication A `authentication` block as defined above.
         * 
         * @return builder
         * 
         */
        public Builder authentication(@Nullable Output<RegistryTaskSourceTriggerAuthenticationArgs> authentication) {
            $.authentication = authentication;
            return this;
        }

        /**
         * @param authentication A `authentication` block as defined above.
         * 
         * @return builder
         * 
         */
        public Builder authentication(RegistryTaskSourceTriggerAuthenticationArgs authentication) {
            return authentication(Output.of(authentication));
        }

        /**
         * @param branch The branch name of the source code.
         * 
         * @return builder
         * 
         */
        public Builder branch(@Nullable Output<String> branch) {
            $.branch = branch;
            return this;
        }

        /**
         * @param branch The branch name of the source code.
         * 
         * @return builder
         * 
         */
        public Builder branch(String branch) {
            return branch(Output.of(branch));
        }

        /**
         * @param enabled Should the trigger be enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Should the trigger be enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param events Specifies a list of source events corresponding to the trigger. Possible values are `commit` and `pullrequest`.
         * 
         * @return builder
         * 
         */
        public Builder events(Output<List<String>> events) {
            $.events = events;
            return this;
        }

        /**
         * @param events Specifies a list of source events corresponding to the trigger. Possible values are `commit` and `pullrequest`.
         * 
         * @return builder
         * 
         */
        public Builder events(List<String> events) {
            return events(Output.of(events));
        }

        /**
         * @param events Specifies a list of source events corresponding to the trigger. Possible values are `commit` and `pullrequest`.
         * 
         * @return builder
         * 
         */
        public Builder events(String... events) {
            return events(List.of(events));
        }

        /**
         * @param name The name which should be used for this trigger.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this trigger.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param repositoryUrl The full URL to the source code repository.
         * 
         * @return builder
         * 
         */
        public Builder repositoryUrl(Output<String> repositoryUrl) {
            $.repositoryUrl = repositoryUrl;
            return this;
        }

        /**
         * @param repositoryUrl The full URL to the source code repository.
         * 
         * @return builder
         * 
         */
        public Builder repositoryUrl(String repositoryUrl) {
            return repositoryUrl(Output.of(repositoryUrl));
        }

        /**
         * @param sourceType The type of the source control service. Possible values are `Github` and `VisualStudioTeamService`.
         * 
         * @return builder
         * 
         */
        public Builder sourceType(Output<String> sourceType) {
            $.sourceType = sourceType;
            return this;
        }

        /**
         * @param sourceType The type of the source control service. Possible values are `Github` and `VisualStudioTeamService`.
         * 
         * @return builder
         * 
         */
        public Builder sourceType(String sourceType) {
            return sourceType(Output.of(sourceType));
        }

        public RegistryTaskSourceTriggerArgs build() {
            $.events = Objects.requireNonNull($.events, "expected parameter 'events' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.repositoryUrl = Objects.requireNonNull($.repositoryUrl, "expected parameter 'repositoryUrl' to be non-null");
            $.sourceType = Objects.requireNonNull($.sourceType, "expected parameter 'sourceType' to be non-null");
            return $;
        }
    }

}
