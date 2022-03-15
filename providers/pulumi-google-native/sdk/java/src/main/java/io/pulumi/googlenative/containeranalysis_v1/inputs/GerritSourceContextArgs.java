// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1.inputs.AliasContextArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A SourceContext referring to a Gerrit project.
 * 
 */
public final class GerritSourceContextArgs extends io.pulumi.resources.ResourceArgs {

    public static final GerritSourceContextArgs Empty = new GerritSourceContextArgs();

    /**
     * An alias, which may be a branch or tag.
     * 
     */
    @Import(name="aliasContext")
      private final @Nullable Output<AliasContextArgs> aliasContext;

    public Output<AliasContextArgs> getAliasContext() {
        return this.aliasContext == null ? Output.empty() : this.aliasContext;
    }

    /**
     * The full project name within the host. Projects may be nested, so "project/subproject" is a valid project name. The "repo name" is the hostURI/project.
     * 
     */
    @Import(name="gerritProject")
      private final @Nullable Output<String> gerritProject;

    public Output<String> getGerritProject() {
        return this.gerritProject == null ? Output.empty() : this.gerritProject;
    }

    /**
     * The URI of a running Gerrit instance.
     * 
     */
    @Import(name="hostUri")
      private final @Nullable Output<String> hostUri;

    public Output<String> getHostUri() {
        return this.hostUri == null ? Output.empty() : this.hostUri;
    }

    /**
     * A revision (commit) ID.
     * 
     */
    @Import(name="revisionId")
      private final @Nullable Output<String> revisionId;

    public Output<String> getRevisionId() {
        return this.revisionId == null ? Output.empty() : this.revisionId;
    }

    public GerritSourceContextArgs(
        @Nullable Output<AliasContextArgs> aliasContext,
        @Nullable Output<String> gerritProject,
        @Nullable Output<String> hostUri,
        @Nullable Output<String> revisionId) {
        this.aliasContext = aliasContext;
        this.gerritProject = gerritProject;
        this.hostUri = hostUri;
        this.revisionId = revisionId;
    }

    private GerritSourceContextArgs() {
        this.aliasContext = Output.empty();
        this.gerritProject = Output.empty();
        this.hostUri = Output.empty();
        this.revisionId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GerritSourceContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AliasContextArgs> aliasContext;
        private @Nullable Output<String> gerritProject;
        private @Nullable Output<String> hostUri;
        private @Nullable Output<String> revisionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GerritSourceContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliasContext = defaults.aliasContext;
    	      this.gerritProject = defaults.gerritProject;
    	      this.hostUri = defaults.hostUri;
    	      this.revisionId = defaults.revisionId;
        }

        public Builder aliasContext(@Nullable Output<AliasContextArgs> aliasContext) {
            this.aliasContext = aliasContext;
            return this;
        }

        public Builder aliasContext(@Nullable AliasContextArgs aliasContext) {
            this.aliasContext = Output.ofNullable(aliasContext);
            return this;
        }

        public Builder gerritProject(@Nullable Output<String> gerritProject) {
            this.gerritProject = gerritProject;
            return this;
        }

        public Builder gerritProject(@Nullable String gerritProject) {
            this.gerritProject = Output.ofNullable(gerritProject);
            return this;
        }

        public Builder hostUri(@Nullable Output<String> hostUri) {
            this.hostUri = hostUri;
            return this;
        }

        public Builder hostUri(@Nullable String hostUri) {
            this.hostUri = Output.ofNullable(hostUri);
            return this;
        }

        public Builder revisionId(@Nullable Output<String> revisionId) {
            this.revisionId = revisionId;
            return this;
        }

        public Builder revisionId(@Nullable String revisionId) {
            this.revisionId = Output.ofNullable(revisionId);
            return this;
        }
        public GerritSourceContextArgs build() {
            return new GerritSourceContextArgs(aliasContext, gerritProject, hostUri, revisionId);
        }
    }
}
