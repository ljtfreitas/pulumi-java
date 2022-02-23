// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNodeTemplateArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNodeTemplateArgs Empty = new GetNodeTemplateArgs();

    @InputImport(name="nodeTemplate", required=true)
      private final String nodeTemplate;

    public String getNodeTemplate() {
        return this.nodeTemplate;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="region", required=true)
      private final String region;

    public String getRegion() {
        return this.region;
    }

    public GetNodeTemplateArgs(
        String nodeTemplate,
        @Nullable String project,
        String region) {
        this.nodeTemplate = Objects.requireNonNull(nodeTemplate, "expected parameter 'nodeTemplate' to be non-null");
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
    }

    private GetNodeTemplateArgs() {
        this.nodeTemplate = null;
        this.project = null;
        this.region = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nodeTemplate;
        private @Nullable String project;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNodeTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeTemplate = defaults.nodeTemplate;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder setNodeTemplate(String nodeTemplate) {
            this.nodeTemplate = Objects.requireNonNull(nodeTemplate);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public GetNodeTemplateArgs build() {
            return new GetNodeTemplateArgs(nodeTemplate, project, region);
        }
    }
}
