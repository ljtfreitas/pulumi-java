// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeviceLastErrorStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeviceLastErrorStatusArgs Empty = new DeviceLastErrorStatusArgs();

    @Import(name="details")
      private final @Nullable Output<List<Map<String,Object>>> details;

    public Output<List<Map<String,Object>>> getDetails() {
        return this.details == null ? Output.empty() : this.details;
    }

    @Import(name="message")
      private final @Nullable Output<String> message;

    public Output<String> getMessage() {
        return this.message == null ? Output.empty() : this.message;
    }

    @Import(name="number")
      private final @Nullable Output<Integer> number;

    public Output<Integer> getNumber() {
        return this.number == null ? Output.empty() : this.number;
    }

    public DeviceLastErrorStatusArgs(
        @Nullable Output<List<Map<String,Object>>> details,
        @Nullable Output<String> message,
        @Nullable Output<Integer> number) {
        this.details = details;
        this.message = message;
        this.number = number;
    }

    private DeviceLastErrorStatusArgs() {
        this.details = Output.empty();
        this.message = Output.empty();
        this.number = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceLastErrorStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Map<String,Object>>> details;
        private @Nullable Output<String> message;
        private @Nullable Output<Integer> number;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceLastErrorStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.details = defaults.details;
    	      this.message = defaults.message;
    	      this.number = defaults.number;
        }

        public Builder details(@Nullable Output<List<Map<String,Object>>> details) {
            this.details = details;
            return this;
        }

        public Builder details(@Nullable List<Map<String,Object>> details) {
            this.details = Output.ofNullable(details);
            return this;
        }

        public Builder message(@Nullable Output<String> message) {
            this.message = message;
            return this;
        }

        public Builder message(@Nullable String message) {
            this.message = Output.ofNullable(message);
            return this;
        }

        public Builder number(@Nullable Output<Integer> number) {
            this.number = number;
            return this;
        }

        public Builder number(@Nullable Integer number) {
            this.number = Output.ofNullable(number);
            return this;
        }
        public DeviceLastErrorStatusArgs build() {
            return new DeviceLastErrorStatusArgs(details, message, number);
        }
    }
}
