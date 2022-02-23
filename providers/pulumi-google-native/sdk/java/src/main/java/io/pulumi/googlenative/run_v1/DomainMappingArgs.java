// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.run_v1.inputs.DomainMappingSpecArgs;
import io.pulumi.googlenative.run_v1.inputs.DomainMappingStatusArgs;
import io.pulumi.googlenative.run_v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainMappingArgs Empty = new DomainMappingArgs();

    /**
     * The API version for this call such as "domains.cloudrun.com/v1".
     * 
     */
    @InputImport(name="apiVersion")
      private final @Nullable Input<String> apiVersion;

    public Input<String> getApiVersion() {
        return this.apiVersion == null ? Input.empty() : this.apiVersion;
    }

    @InputImport(name="dryRun")
      private final @Nullable Input<String> dryRun;

    public Input<String> getDryRun() {
        return this.dryRun == null ? Input.empty() : this.dryRun;
    }

    /**
     * The kind of resource, in this case "DomainMapping".
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Metadata associated with this BuildTemplate.
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable Input<ObjectMetaArgs> metadata;

    public Input<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The spec for this DomainMapping.
     * 
     */
    @InputImport(name="spec")
      private final @Nullable Input<DomainMappingSpecArgs> spec;

    public Input<DomainMappingSpecArgs> getSpec() {
        return this.spec == null ? Input.empty() : this.spec;
    }

    /**
     * The current status of the DomainMapping.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<DomainMappingStatusArgs> status;

    public Input<DomainMappingStatusArgs> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public DomainMappingArgs(
        @Nullable Input<String> apiVersion,
        @Nullable Input<String> dryRun,
        @Nullable Input<String> kind,
        @Nullable Input<String> location,
        @Nullable Input<ObjectMetaArgs> metadata,
        @Nullable Input<String> project,
        @Nullable Input<DomainMappingSpecArgs> spec,
        @Nullable Input<DomainMappingStatusArgs> status) {
        this.apiVersion = apiVersion;
        this.dryRun = dryRun;
        this.kind = kind;
        this.location = location;
        this.metadata = metadata;
        this.project = project;
        this.spec = spec;
        this.status = status;
    }

    private DomainMappingArgs() {
        this.apiVersion = Input.empty();
        this.dryRun = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.metadata = Input.empty();
        this.project = Input.empty();
        this.spec = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiVersion;
        private @Nullable Input<String> dryRun;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> location;
        private @Nullable Input<ObjectMetaArgs> metadata;
        private @Nullable Input<String> project;
        private @Nullable Input<DomainMappingSpecArgs> spec;
        private @Nullable Input<DomainMappingStatusArgs> status;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.dryRun = defaults.dryRun;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.project = defaults.project;
    	      this.spec = defaults.spec;
    	      this.status = defaults.status;
        }

        public Builder setApiVersion(@Nullable Input<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = Input.ofNullable(apiVersion);
            return this;
        }

        public Builder setDryRun(@Nullable Input<String> dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        public Builder setDryRun(@Nullable String dryRun) {
            this.dryRun = Input.ofNullable(dryRun);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMetadata(@Nullable Input<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSpec(@Nullable Input<DomainMappingSpecArgs> spec) {
            this.spec = spec;
            return this;
        }

        public Builder setSpec(@Nullable DomainMappingSpecArgs spec) {
            this.spec = Input.ofNullable(spec);
            return this;
        }

        public Builder setStatus(@Nullable Input<DomainMappingStatusArgs> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable DomainMappingStatusArgs status) {
            this.status = Input.ofNullable(status);
            return this;
        }
        public DomainMappingArgs build() {
            return new DomainMappingArgs(apiVersion, dryRun, kind, location, metadata, project, spec, status);
        }
    }
}
