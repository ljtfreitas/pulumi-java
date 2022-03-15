// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDatabaseInstanceIpAddress {
    private final String ipAddress;
    private final String timeToRetire;
    private final String type;

    @CustomType.Constructor
    private GetDatabaseInstanceIpAddress(
        @CustomType.Parameter("ipAddress") String ipAddress,
        @CustomType.Parameter("timeToRetire") String timeToRetire,
        @CustomType.Parameter("type") String type) {
        this.ipAddress = ipAddress;
        this.timeToRetire = timeToRetire;
        this.type = type;
    }

    public String getIpAddress() {
        return this.ipAddress;
    }
    public String getTimeToRetire() {
        return this.timeToRetire;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseInstanceIpAddress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipAddress;
        private String timeToRetire;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseInstanceIpAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.timeToRetire = defaults.timeToRetire;
    	      this.type = defaults.type;
        }

        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }

        public Builder timeToRetire(String timeToRetire) {
            this.timeToRetire = Objects.requireNonNull(timeToRetire);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetDatabaseInstanceIpAddress build() {
            return new GetDatabaseInstanceIpAddress(ipAddress, timeToRetire, type);
        }
    }
}
