// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionAppSourceControlArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionAppSourceControlArgs Empty = new FunctionAppSourceControlArgs();

    /**
     * The branch of the remote repository to use. Defaults to &#39;master&#39;.
     * 
     */
    @Import(name="branch")
    private @Nullable Output<String> branch;

    /**
     * @return The branch of the remote repository to use. Defaults to &#39;master&#39;.
     * 
     */
    public Optional<Output<String>> branch() {
        return Optional.ofNullable(this.branch);
    }

    /**
     * Limits to manual integration. Defaults to `false` if not specified.
     * 
     */
    @Import(name="manualIntegration")
    private @Nullable Output<Boolean> manualIntegration;

    /**
     * @return Limits to manual integration. Defaults to `false` if not specified.
     * 
     */
    public Optional<Output<Boolean>> manualIntegration() {
        return Optional.ofNullable(this.manualIntegration);
    }

    /**
     * The URL of the source code repository.
     * 
     */
    @Import(name="repoUrl")
    private @Nullable Output<String> repoUrl;

    /**
     * @return The URL of the source code repository.
     * 
     */
    public Optional<Output<String>> repoUrl() {
        return Optional.ofNullable(this.repoUrl);
    }

    /**
     * Enable roll-back for the repository. Defaults to `false` if not specified.
     * 
     */
    @Import(name="rollbackEnabled")
    private @Nullable Output<Boolean> rollbackEnabled;

    /**
     * @return Enable roll-back for the repository. Defaults to `false` if not specified.
     * 
     */
    public Optional<Output<Boolean>> rollbackEnabled() {
        return Optional.ofNullable(this.rollbackEnabled);
    }

    /**
     * Use Mercurial if `true`, otherwise uses Git.
     * 
     */
    @Import(name="useMercurial")
    private @Nullable Output<Boolean> useMercurial;

    /**
     * @return Use Mercurial if `true`, otherwise uses Git.
     * 
     */
    public Optional<Output<Boolean>> useMercurial() {
        return Optional.ofNullable(this.useMercurial);
    }

    private FunctionAppSourceControlArgs() {}

    private FunctionAppSourceControlArgs(FunctionAppSourceControlArgs $) {
        this.branch = $.branch;
        this.manualIntegration = $.manualIntegration;
        this.repoUrl = $.repoUrl;
        this.rollbackEnabled = $.rollbackEnabled;
        this.useMercurial = $.useMercurial;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionAppSourceControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionAppSourceControlArgs $;

        public Builder() {
            $ = new FunctionAppSourceControlArgs();
        }

        public Builder(FunctionAppSourceControlArgs defaults) {
            $ = new FunctionAppSourceControlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param branch The branch of the remote repository to use. Defaults to &#39;master&#39;.
         * 
         * @return builder
         * 
         */
        public Builder branch(@Nullable Output<String> branch) {
            $.branch = branch;
            return this;
        }

        /**
         * @param branch The branch of the remote repository to use. Defaults to &#39;master&#39;.
         * 
         * @return builder
         * 
         */
        public Builder branch(String branch) {
            return branch(Output.of(branch));
        }

        /**
         * @param manualIntegration Limits to manual integration. Defaults to `false` if not specified.
         * 
         * @return builder
         * 
         */
        public Builder manualIntegration(@Nullable Output<Boolean> manualIntegration) {
            $.manualIntegration = manualIntegration;
            return this;
        }

        /**
         * @param manualIntegration Limits to manual integration. Defaults to `false` if not specified.
         * 
         * @return builder
         * 
         */
        public Builder manualIntegration(Boolean manualIntegration) {
            return manualIntegration(Output.of(manualIntegration));
        }

        /**
         * @param repoUrl The URL of the source code repository.
         * 
         * @return builder
         * 
         */
        public Builder repoUrl(@Nullable Output<String> repoUrl) {
            $.repoUrl = repoUrl;
            return this;
        }

        /**
         * @param repoUrl The URL of the source code repository.
         * 
         * @return builder
         * 
         */
        public Builder repoUrl(String repoUrl) {
            return repoUrl(Output.of(repoUrl));
        }

        /**
         * @param rollbackEnabled Enable roll-back for the repository. Defaults to `false` if not specified.
         * 
         * @return builder
         * 
         */
        public Builder rollbackEnabled(@Nullable Output<Boolean> rollbackEnabled) {
            $.rollbackEnabled = rollbackEnabled;
            return this;
        }

        /**
         * @param rollbackEnabled Enable roll-back for the repository. Defaults to `false` if not specified.
         * 
         * @return builder
         * 
         */
        public Builder rollbackEnabled(Boolean rollbackEnabled) {
            return rollbackEnabled(Output.of(rollbackEnabled));
        }

        /**
         * @param useMercurial Use Mercurial if `true`, otherwise uses Git.
         * 
         * @return builder
         * 
         */
        public Builder useMercurial(@Nullable Output<Boolean> useMercurial) {
            $.useMercurial = useMercurial;
            return this;
        }

        /**
         * @param useMercurial Use Mercurial if `true`, otherwise uses Git.
         * 
         * @return builder
         * 
         */
        public Builder useMercurial(Boolean useMercurial) {
            return useMercurial(Output.of(useMercurial));
        }

        public FunctionAppSourceControlArgs build() {
            return $;
        }
    }

}
