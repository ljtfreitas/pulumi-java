// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.sqladmin_v1.enums.IpMappingType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Database instance IP Mapping.
 * 
 */
public final class IpMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final IpMappingArgs Empty = new IpMappingArgs();

    /**
     * The IP address assigned.
     * 
     */
    @Import(name="ipAddress")
      private final @Nullable Output<String> ipAddress;

    public Output<String> getIpAddress() {
        return this.ipAddress == null ? Output.empty() : this.ipAddress;
    }

    /**
     * The due time for this IP to be retired in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`. This field is only available when the IP is scheduled to be retired.
     * 
     */
    @Import(name="timeToRetire")
      private final @Nullable Output<String> timeToRetire;

    public Output<String> getTimeToRetire() {
        return this.timeToRetire == null ? Output.empty() : this.timeToRetire;
    }

    /**
     * The type of this IP address. A `PRIMARY` address is a public address that can accept incoming connections. A `PRIVATE` address is a private address that can accept incoming connections. An `OUTGOING` address is the source address of connections originating from the instance, if supported.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<IpMappingType> type;

    public Output<IpMappingType> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public IpMappingArgs(
        @Nullable Output<String> ipAddress,
        @Nullable Output<String> timeToRetire,
        @Nullable Output<IpMappingType> type) {
        this.ipAddress = ipAddress;
        this.timeToRetire = timeToRetire;
        this.type = type;
    }

    private IpMappingArgs() {
        this.ipAddress = Output.empty();
        this.timeToRetire = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ipAddress;
        private @Nullable Output<String> timeToRetire;
        private @Nullable Output<IpMappingType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(IpMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.timeToRetire = defaults.timeToRetire;
    	      this.type = defaults.type;
        }

        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Output.ofNullable(ipAddress);
            return this;
        }

        public Builder timeToRetire(@Nullable Output<String> timeToRetire) {
            this.timeToRetire = timeToRetire;
            return this;
        }

        public Builder timeToRetire(@Nullable String timeToRetire) {
            this.timeToRetire = Output.ofNullable(timeToRetire);
            return this;
        }

        public Builder type(@Nullable Output<IpMappingType> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable IpMappingType type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public IpMappingArgs build() {
            return new IpMappingArgs(ipAddress, timeToRetire, type);
        }
    }
}
