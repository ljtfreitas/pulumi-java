// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudidentity.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDeviceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeviceArgs Empty = new GetDeviceArgs();

    @Import(name="customer")
    private @Nullable Output<String> customer;

    public Optional<Output<String>> customer() {
        return Optional.ofNullable(this.customer);
    }

    @Import(name="deviceId", required=true)
    private Output<String> deviceId;

    public Output<String> deviceId() {
        return this.deviceId;
    }

    private GetDeviceArgs() {}

    private GetDeviceArgs(GetDeviceArgs $) {
        this.customer = $.customer;
        this.deviceId = $.deviceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeviceArgs $;

        public Builder() {
            $ = new GetDeviceArgs();
        }

        public Builder(GetDeviceArgs defaults) {
            $ = new GetDeviceArgs(Objects.requireNonNull(defaults));
        }

        public Builder customer(@Nullable Output<String> customer) {
            $.customer = customer;
            return this;
        }

        public Builder customer(String customer) {
            return customer(Output.of(customer));
        }

        public Builder deviceId(Output<String> deviceId) {
            $.deviceId = deviceId;
            return this;
        }

        public Builder deviceId(String deviceId) {
            return deviceId(Output.of(deviceId));
        }

        public GetDeviceArgs build() {
            $.deviceId = Objects.requireNonNull($.deviceId, "expected parameter 'deviceId' to be non-null");
            return $;
        }
    }

}
