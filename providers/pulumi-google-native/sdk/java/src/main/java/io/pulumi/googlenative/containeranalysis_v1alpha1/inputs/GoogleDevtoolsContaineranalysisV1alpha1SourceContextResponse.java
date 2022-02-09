// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse Empty = new GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse();

    @InputImport(name="cloudRepo", required=true)
    private final GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextResponse cloudRepo;

    public GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextResponse getCloudRepo() {
        return this.cloudRepo;
    }

    @InputImport(name="gerrit", required=true)
    private final GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse gerrit;

    public GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse getGerrit() {
        return this.gerrit;
    }

    @InputImport(name="git", required=true)
    private final GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextResponse git;

    public GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextResponse getGit() {
        return this.git;
    }

    @InputImport(name="labels", required=true)
    private final Map<String,String> labels;

    public Map<String,String> getLabels() {
        return this.labels;
    }

    public GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse(
        GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextResponse cloudRepo,
        GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse gerrit,
        GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextResponse git,
        Map<String,String> labels) {
        this.cloudRepo = Objects.requireNonNull(cloudRepo, "expected parameter 'cloudRepo' to be non-null");
        this.gerrit = Objects.requireNonNull(gerrit, "expected parameter 'gerrit' to be non-null");
        this.git = Objects.requireNonNull(git, "expected parameter 'git' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
    }

    private GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse() {
        this.cloudRepo = null;
        this.gerrit = null;
        this.git = null;
        this.labels = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextResponse cloudRepo;
        private GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse gerrit;
        private GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextResponse git;
        private Map<String,String> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudRepo = defaults.cloudRepo;
    	      this.gerrit = defaults.gerrit;
    	      this.git = defaults.git;
    	      this.labels = defaults.labels;
        }

        public Builder setCloudRepo(GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextResponse cloudRepo) {
            this.cloudRepo = Objects.requireNonNull(cloudRepo);
            return this;
        }

        public Builder setGerrit(GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextResponse gerrit) {
            this.gerrit = Objects.requireNonNull(gerrit);
            return this;
        }

        public Builder setGit(GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextResponse git) {
            this.git = Objects.requireNonNull(git);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse build() {
            return new GoogleDevtoolsContaineranalysisV1alpha1SourceContextResponse(cloudRepo, gerrit, git, labels);
        }
    }
}