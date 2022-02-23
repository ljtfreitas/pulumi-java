// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineDeviceRegistryEnrichArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineDeviceRegistryEnrichArgs Empty = new PipelineDeviceRegistryEnrichArgs();

    @InputImport(name="attribute", required=true)
        private final Input<String> attribute;

    public Input<String> getAttribute() {
        return this.attribute;
    }

    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="next")
        private final @Nullable Input<String> next;

    public Input<String> getNext() {
        return this.next == null ? Input.empty() : this.next;
    }

    @InputImport(name="roleArn", required=true)
        private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    @InputImport(name="thingName", required=true)
        private final Input<String> thingName;

    public Input<String> getThingName() {
        return this.thingName;
    }

    public PipelineDeviceRegistryEnrichArgs(
        Input<String> attribute,
        Input<String> name,
        @Nullable Input<String> next,
        Input<String> roleArn,
        Input<String> thingName) {
        this.attribute = Objects.requireNonNull(attribute, "expected parameter 'attribute' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.next = next;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.thingName = Objects.requireNonNull(thingName, "expected parameter 'thingName' to be non-null");
    }

    private PipelineDeviceRegistryEnrichArgs() {
        this.attribute = Input.empty();
        this.name = Input.empty();
        this.next = Input.empty();
        this.roleArn = Input.empty();
        this.thingName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineDeviceRegistryEnrichArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> attribute;
        private Input<String> name;
        private @Nullable Input<String> next;
        private Input<String> roleArn;
        private Input<String> thingName;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineDeviceRegistryEnrichArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.name = defaults.name;
    	      this.next = defaults.next;
    	      this.roleArn = defaults.roleArn;
    	      this.thingName = defaults.thingName;
        }

        public Builder setAttribute(Input<String> attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }

        public Builder setAttribute(String attribute) {
            this.attribute = Input.of(Objects.requireNonNull(attribute));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setNext(@Nullable Input<String> next) {
            this.next = next;
            return this;
        }

        public Builder setNext(@Nullable String next) {
            this.next = Input.ofNullable(next);
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder setThingName(Input<String> thingName) {
            this.thingName = Objects.requireNonNull(thingName);
            return this;
        }

        public Builder setThingName(String thingName) {
            this.thingName = Input.of(Objects.requireNonNull(thingName));
            return this;
        }
        public PipelineDeviceRegistryEnrichArgs build() {
            return new PipelineDeviceRegistryEnrichArgs(attribute, name, next, roleArn, thingName);
        }
    }
}
