// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis.v1.inputs.CloudRepoSourceContextArgs;
import com.pulumi.googlenative.containeranalysis.v1.inputs.GerritSourceContextArgs;
import com.pulumi.googlenative.containeranalysis.v1.inputs.GitSourceContextArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A SourceContext is a reference to a tree of files. A SourceContext together with a path point to a unique revision of a single file or directory.
 * 
 */
public final class SourceContextArgs extends com.pulumi.resources.ResourceArgs {

    public static final SourceContextArgs Empty = new SourceContextArgs();

    /**
     * A SourceContext referring to a revision in a Google Cloud Source Repo.
     * 
     */
    @Import(name="cloudRepo")
    private @Nullable Output<CloudRepoSourceContextArgs> cloudRepo;

    /**
     * @return A SourceContext referring to a revision in a Google Cloud Source Repo.
     * 
     */
    public Optional<Output<CloudRepoSourceContextArgs>> cloudRepo() {
        return Optional.ofNullable(this.cloudRepo);
    }

    /**
     * A SourceContext referring to a Gerrit project.
     * 
     */
    @Import(name="gerrit")
    private @Nullable Output<GerritSourceContextArgs> gerrit;

    /**
     * @return A SourceContext referring to a Gerrit project.
     * 
     */
    public Optional<Output<GerritSourceContextArgs>> gerrit() {
        return Optional.ofNullable(this.gerrit);
    }

    /**
     * A SourceContext referring to any third party Git repo (e.g., GitHub).
     * 
     */
    @Import(name="git")
    private @Nullable Output<GitSourceContextArgs> git;

    /**
     * @return A SourceContext referring to any third party Git repo (e.g., GitHub).
     * 
     */
    public Optional<Output<GitSourceContextArgs>> git() {
        return Optional.ofNullable(this.git);
    }

    /**
     * Labels with user defined metadata.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels with user defined metadata.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    private SourceContextArgs() {}

    private SourceContextArgs(SourceContextArgs $) {
        this.cloudRepo = $.cloudRepo;
        this.gerrit = $.gerrit;
        this.git = $.git;
        this.labels = $.labels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SourceContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceContextArgs $;

        public Builder() {
            $ = new SourceContextArgs();
        }

        public Builder(SourceContextArgs defaults) {
            $ = new SourceContextArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudRepo A SourceContext referring to a revision in a Google Cloud Source Repo.
         * 
         * @return builder
         * 
         */
        public Builder cloudRepo(@Nullable Output<CloudRepoSourceContextArgs> cloudRepo) {
            $.cloudRepo = cloudRepo;
            return this;
        }

        /**
         * @param cloudRepo A SourceContext referring to a revision in a Google Cloud Source Repo.
         * 
         * @return builder
         * 
         */
        public Builder cloudRepo(CloudRepoSourceContextArgs cloudRepo) {
            return cloudRepo(Output.of(cloudRepo));
        }

        /**
         * @param gerrit A SourceContext referring to a Gerrit project.
         * 
         * @return builder
         * 
         */
        public Builder gerrit(@Nullable Output<GerritSourceContextArgs> gerrit) {
            $.gerrit = gerrit;
            return this;
        }

        /**
         * @param gerrit A SourceContext referring to a Gerrit project.
         * 
         * @return builder
         * 
         */
        public Builder gerrit(GerritSourceContextArgs gerrit) {
            return gerrit(Output.of(gerrit));
        }

        /**
         * @param git A SourceContext referring to any third party Git repo (e.g., GitHub).
         * 
         * @return builder
         * 
         */
        public Builder git(@Nullable Output<GitSourceContextArgs> git) {
            $.git = git;
            return this;
        }

        /**
         * @param git A SourceContext referring to any third party Git repo (e.g., GitHub).
         * 
         * @return builder
         * 
         */
        public Builder git(GitSourceContextArgs git) {
            return git(Output.of(git));
        }

        /**
         * @param labels Labels with user defined metadata.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels with user defined metadata.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public SourceContextArgs build() {
            return $;
        }
    }

}
