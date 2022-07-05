// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration of logging on a health check. If logging is enabled, logs will be exported to Stackdriver.
 * 
 */
public final class HealthCheckLogConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final HealthCheckLogConfigArgs Empty = new HealthCheckLogConfigArgs();

    /**
     * Indicates whether or not to export logs. This is false by default, which means no health check logging will be done.
     * 
     */
    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    /**
     * @return Indicates whether or not to export logs. This is false by default, which means no health check logging will be done.
     * 
     */
    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    private HealthCheckLogConfigArgs() {}

    private HealthCheckLogConfigArgs(HealthCheckLogConfigArgs $) {
        this.enable = $.enable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HealthCheckLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HealthCheckLogConfigArgs $;

        public Builder() {
            $ = new HealthCheckLogConfigArgs();
        }

        public Builder(HealthCheckLogConfigArgs defaults) {
            $ = new HealthCheckLogConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enable Indicates whether or not to export logs. This is false by default, which means no health check logging will be done.
         * 
         * @return builder
         * 
         */
        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param enable Indicates whether or not to export logs. This is false by default, which means no health check logging will be done.
         * 
         * @return builder
         * 
         */
        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        public HealthCheckLogConfigArgs build() {
            return $;
        }
    }

}
