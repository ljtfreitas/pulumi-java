// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigee.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceAttachmentState extends io.pulumi.resources.ResourceArgs {

    public static final InstanceAttachmentState Empty = new InstanceAttachmentState();

    @InputImport(name="environment")
    private final @Nullable Input<String> environment;

    public Input<String> getEnvironment() {
        return this.environment == null ? Input.empty() : this.environment;
    }

    @InputImport(name="instanceId")
    private final @Nullable Input<String> instanceId;

    public Input<String> getInstanceId() {
        return this.instanceId == null ? Input.empty() : this.instanceId;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public InstanceAttachmentState(
        @Nullable Input<String> environment,
        @Nullable Input<String> instanceId,
        @Nullable Input<String> name) {
        this.environment = environment;
        this.instanceId = instanceId;
        this.name = name;
    }

    private InstanceAttachmentState() {
        this.environment = Input.empty();
        this.instanceId = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> environment;
        private @Nullable Input<String> instanceId;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceAttachmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environment = defaults.environment;
    	      this.instanceId = defaults.instanceId;
    	      this.name = defaults.name;
        }

        public Builder setEnvironment(@Nullable Input<String> environment) {
            this.environment = environment;
            return this;
        }

        public Builder setEnvironment(@Nullable String environment) {
            this.environment = Input.ofNullable(environment);
            return this;
        }

        public Builder setInstanceId(@Nullable Input<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        public Builder setInstanceId(@Nullable String instanceId) {
            this.instanceId = Input.ofNullable(instanceId);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public InstanceAttachmentState build() {
            return new InstanceAttachmentState(environment, instanceId, name);
        }
    }
}