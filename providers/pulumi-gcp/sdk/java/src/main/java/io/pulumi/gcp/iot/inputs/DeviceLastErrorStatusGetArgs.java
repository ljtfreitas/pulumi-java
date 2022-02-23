// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeviceLastErrorStatusGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeviceLastErrorStatusGetArgs Empty = new DeviceLastErrorStatusGetArgs();

    @InputImport(name="details")
        private final @Nullable Input<List<Map<String,Object>>> details;

    public Input<List<Map<String,Object>>> getDetails() {
        return this.details == null ? Input.empty() : this.details;
    }

    @InputImport(name="message")
        private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    @InputImport(name="number")
        private final @Nullable Input<Integer> number;

    public Input<Integer> getNumber() {
        return this.number == null ? Input.empty() : this.number;
    }

    public DeviceLastErrorStatusGetArgs(
        @Nullable Input<List<Map<String,Object>>> details,
        @Nullable Input<String> message,
        @Nullable Input<Integer> number) {
        this.details = details;
        this.message = message;
        this.number = number;
    }

    private DeviceLastErrorStatusGetArgs() {
        this.details = Input.empty();
        this.message = Input.empty();
        this.number = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceLastErrorStatusGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Map<String,Object>>> details;
        private @Nullable Input<String> message;
        private @Nullable Input<Integer> number;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceLastErrorStatusGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.details = defaults.details;
    	      this.message = defaults.message;
    	      this.number = defaults.number;
        }

        public Builder setDetails(@Nullable Input<List<Map<String,Object>>> details) {
            this.details = details;
            return this;
        }

        public Builder setDetails(@Nullable List<Map<String,Object>> details) {
            this.details = Input.ofNullable(details);
            return this;
        }

        public Builder setMessage(@Nullable Input<String> message) {
            this.message = message;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = Input.ofNullable(message);
            return this;
        }

        public Builder setNumber(@Nullable Input<Integer> number) {
            this.number = number;
            return this;
        }

        public Builder setNumber(@Nullable Integer number) {
            this.number = Input.ofNullable(number);
            return this;
        }
        public DeviceLastErrorStatusGetArgs build() {
            return new DeviceLastErrorStatusGetArgs(details, message, number);
        }
    }
}
