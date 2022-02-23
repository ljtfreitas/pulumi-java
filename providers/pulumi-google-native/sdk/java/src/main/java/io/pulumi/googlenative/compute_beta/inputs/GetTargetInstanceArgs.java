// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTargetInstanceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTargetInstanceArgs Empty = new GetTargetInstanceArgs();

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="targetInstance", required=true)
      private final String targetInstance;

    public String getTargetInstance() {
        return this.targetInstance;
    }

    @InputImport(name="zone", required=true)
      private final String zone;

    public String getZone() {
        return this.zone;
    }

    public GetTargetInstanceArgs(
        @Nullable String project,
        String targetInstance,
        String zone) {
        this.project = project;
        this.targetInstance = Objects.requireNonNull(targetInstance, "expected parameter 'targetInstance' to be non-null");
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private GetTargetInstanceArgs() {
        this.project = null;
        this.targetInstance = null;
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTargetInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String targetInstance;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTargetInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.targetInstance = defaults.targetInstance;
    	      this.zone = defaults.zone;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setTargetInstance(String targetInstance) {
            this.targetInstance = Objects.requireNonNull(targetInstance);
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public GetTargetInstanceArgs build() {
            return new GetTargetInstanceArgs(project, targetInstance, zone);
        }
    }
}
