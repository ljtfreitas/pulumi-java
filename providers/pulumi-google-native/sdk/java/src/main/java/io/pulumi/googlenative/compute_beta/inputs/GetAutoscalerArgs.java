// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAutoscalerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAutoscalerArgs Empty = new GetAutoscalerArgs();

    @Import(name="autoscaler", required=true)
      private final String autoscaler;

    public String getAutoscaler() {
        return this.autoscaler;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="zone", required=true)
      private final String zone;

    public String getZone() {
        return this.zone;
    }

    public GetAutoscalerArgs(
        String autoscaler,
        @Nullable String project,
        String zone) {
        this.autoscaler = Objects.requireNonNull(autoscaler, "expected parameter 'autoscaler' to be non-null");
        this.project = project;
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private GetAutoscalerArgs() {
        this.autoscaler = null;
        this.project = null;
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutoscalerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autoscaler;
        private @Nullable String project;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAutoscalerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaler = defaults.autoscaler;
    	      this.project = defaults.project;
    	      this.zone = defaults.zone;
        }

        public Builder autoscaler(String autoscaler) {
            this.autoscaler = Objects.requireNonNull(autoscaler);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public GetAutoscalerArgs build() {
            return new GetAutoscalerArgs(autoscaler, project, zone);
        }
    }
}
