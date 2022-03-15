// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseInstanceIpAddressArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceIpAddressArgs Empty = new DatabaseInstanceIpAddressArgs();

    @Import(name="ipAddress")
      private final @Nullable Output<String> ipAddress;

    public Output<String> getIpAddress() {
        return this.ipAddress == null ? Output.empty() : this.ipAddress;
    }

    @Import(name="timeToRetire")
      private final @Nullable Output<String> timeToRetire;

    public Output<String> getTimeToRetire() {
        return this.timeToRetire == null ? Output.empty() : this.timeToRetire;
    }

    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public DatabaseInstanceIpAddressArgs(
        @Nullable Output<String> ipAddress,
        @Nullable Output<String> timeToRetire,
        @Nullable Output<String> type) {
        this.ipAddress = ipAddress;
        this.timeToRetire = timeToRetire;
        this.type = type;
    }

    private DatabaseInstanceIpAddressArgs() {
        this.ipAddress = Output.empty();
        this.timeToRetire = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceIpAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ipAddress;
        private @Nullable Output<String> timeToRetire;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceIpAddressArgs defaults) {
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

        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public DatabaseInstanceIpAddressArgs build() {
            return new DatabaseInstanceIpAddressArgs(ipAddress, timeToRetire, type);
        }
    }
}
