// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class IpSetIpSetDescriptor {
    /**
     * The string like IPV4 or IPV6.
     * 
     */
    private final String type;
    /**
     * The CIDR notation.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"type","value"})
    private IpSetIpSetDescriptor(
        String type,
        String value) {
        this.type = Objects.requireNonNull(type);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * The string like IPV4 or IPV6.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * The CIDR notation.
     * 
     */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpSetIpSetDescriptor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(IpSetIpSetDescriptor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public IpSetIpSetDescriptor build() {
            return new IpSetIpSetDescriptor(type, value);
        }
    }
}
