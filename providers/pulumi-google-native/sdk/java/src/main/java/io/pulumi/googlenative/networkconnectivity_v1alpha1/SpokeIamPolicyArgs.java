// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkconnectivity_v1alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.networkconnectivity_v1alpha1.inputs.AuditConfigArgs;
import io.pulumi.googlenative.networkconnectivity_v1alpha1.inputs.BindingArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpokeIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpokeIamPolicyArgs Empty = new SpokeIamPolicyArgs();

    @InputImport(name="auditConfigs")
    private final @Nullable Input<List<AuditConfigArgs>> auditConfigs;

    public Input<List<AuditConfigArgs>> getAuditConfigs() {
        return this.auditConfigs == null ? Input.empty() : this.auditConfigs;
    }

    @InputImport(name="bindings")
    private final @Nullable Input<List<BindingArgs>> bindings;

    public Input<List<BindingArgs>> getBindings() {
        return this.bindings == null ? Input.empty() : this.bindings;
    }

    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="spokeId", required=true)
    private final Input<String> spokeId;

    public Input<String> getSpokeId() {
        return this.spokeId;
    }

    @InputImport(name="updateMask")
    private final @Nullable Input<String> updateMask;

    public Input<String> getUpdateMask() {
        return this.updateMask == null ? Input.empty() : this.updateMask;
    }

    @InputImport(name="version")
    private final @Nullable Input<Integer> version;

    public Input<Integer> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public SpokeIamPolicyArgs(
        @Nullable Input<List<AuditConfigArgs>> auditConfigs,
        @Nullable Input<List<BindingArgs>> bindings,
        @Nullable Input<String> etag,
        @Nullable Input<String> location,
        @Nullable Input<String> project,
        Input<String> spokeId,
        @Nullable Input<String> updateMask,
        @Nullable Input<Integer> version) {
        this.auditConfigs = auditConfigs;
        this.bindings = bindings;
        this.etag = etag;
        this.location = location;
        this.project = project;
        this.spokeId = Objects.requireNonNull(spokeId, "expected parameter 'spokeId' to be non-null");
        this.updateMask = updateMask;
        this.version = version;
    }

    private SpokeIamPolicyArgs() {
        this.auditConfigs = Input.empty();
        this.bindings = Input.empty();
        this.etag = Input.empty();
        this.location = Input.empty();
        this.project = Input.empty();
        this.spokeId = Input.empty();
        this.updateMask = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpokeIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AuditConfigArgs>> auditConfigs;
        private @Nullable Input<List<BindingArgs>> bindings;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> location;
        private @Nullable Input<String> project;
        private Input<String> spokeId;
        private @Nullable Input<String> updateMask;
        private @Nullable Input<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(SpokeIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditConfigs = defaults.auditConfigs;
    	      this.bindings = defaults.bindings;
    	      this.etag = defaults.etag;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.spokeId = defaults.spokeId;
    	      this.updateMask = defaults.updateMask;
    	      this.version = defaults.version;
        }

        public Builder setAuditConfigs(@Nullable Input<List<AuditConfigArgs>> auditConfigs) {
            this.auditConfigs = auditConfigs;
            return this;
        }

        public Builder setAuditConfigs(@Nullable List<AuditConfigArgs> auditConfigs) {
            this.auditConfigs = Input.ofNullable(auditConfigs);
            return this;
        }

        public Builder setBindings(@Nullable Input<List<BindingArgs>> bindings) {
            this.bindings = bindings;
            return this;
        }

        public Builder setBindings(@Nullable List<BindingArgs> bindings) {
            this.bindings = Input.ofNullable(bindings);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSpokeId(Input<String> spokeId) {
            this.spokeId = Objects.requireNonNull(spokeId);
            return this;
        }

        public Builder setSpokeId(String spokeId) {
            this.spokeId = Input.of(Objects.requireNonNull(spokeId));
            return this;
        }

        public Builder setUpdateMask(@Nullable Input<String> updateMask) {
            this.updateMask = updateMask;
            return this;
        }

        public Builder setUpdateMask(@Nullable String updateMask) {
            this.updateMask = Input.ofNullable(updateMask);
            return this;
        }

        public Builder setVersion(@Nullable Input<Integer> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable Integer version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public SpokeIamPolicyArgs build() {
            return new SpokeIamPolicyArgs(auditConfigs, bindings, etag, location, project, spokeId, updateMask, version);
        }
    }
}