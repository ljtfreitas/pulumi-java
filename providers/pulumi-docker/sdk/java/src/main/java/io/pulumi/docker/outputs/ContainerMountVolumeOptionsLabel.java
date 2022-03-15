// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ContainerMountVolumeOptionsLabel {
    private final String label;
    private final String value;

    @CustomType.Constructor
    private ContainerMountVolumeOptionsLabel(
        @CustomType.Parameter("label") String label,
        @CustomType.Parameter("value") String value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return this.label;
    }
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerMountVolumeOptionsLabel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String label;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerMountVolumeOptionsLabel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.label = defaults.label;
    	      this.value = defaults.value;
        }

        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ContainerMountVolumeOptionsLabel build() {
            return new ContainerMountVolumeOptionsLabel(label, value);
        }
    }
}
