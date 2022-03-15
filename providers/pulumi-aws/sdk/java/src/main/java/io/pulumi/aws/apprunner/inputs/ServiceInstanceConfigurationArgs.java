// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apprunner.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceInstanceConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceInstanceConfigurationArgs Empty = new ServiceInstanceConfigurationArgs();

    /**
     * The number of CPU units reserved for each instance of your App Runner service represented as a String. Defaults to `1024`. Valid values: `1024|2048|(1|2) vCPU`.
     * 
     */
    @Import(name="cpu")
      private final @Nullable Output<String> cpu;

    public Output<String> getCpu() {
        return this.cpu == null ? Output.empty() : this.cpu;
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM role that provides permissions to your App Runner service. These are permissions that your code needs when it calls any AWS APIs.
     * 
     */
    @Import(name="instanceRoleArn")
      private final @Nullable Output<String> instanceRoleArn;

    public Output<String> getInstanceRoleArn() {
        return this.instanceRoleArn == null ? Output.empty() : this.instanceRoleArn;
    }

    /**
     * The amount of memory, in MB or GB, reserved for each instance of your App Runner service. Defaults to `2048`. Valid values: `2048|3072|4096|(2|3|4) GB`.
     * 
     */
    @Import(name="memory")
      private final @Nullable Output<String> memory;

    public Output<String> getMemory() {
        return this.memory == null ? Output.empty() : this.memory;
    }

    public ServiceInstanceConfigurationArgs(
        @Nullable Output<String> cpu,
        @Nullable Output<String> instanceRoleArn,
        @Nullable Output<String> memory) {
        this.cpu = cpu;
        this.instanceRoleArn = instanceRoleArn;
        this.memory = memory;
    }

    private ServiceInstanceConfigurationArgs() {
        this.cpu = Output.empty();
        this.instanceRoleArn = Output.empty();
        this.memory = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceInstanceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cpu;
        private @Nullable Output<String> instanceRoleArn;
        private @Nullable Output<String> memory;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceInstanceConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.instanceRoleArn = defaults.instanceRoleArn;
    	      this.memory = defaults.memory;
        }

        public Builder cpu(@Nullable Output<String> cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder cpu(@Nullable String cpu) {
            this.cpu = Output.ofNullable(cpu);
            return this;
        }

        public Builder instanceRoleArn(@Nullable Output<String> instanceRoleArn) {
            this.instanceRoleArn = instanceRoleArn;
            return this;
        }

        public Builder instanceRoleArn(@Nullable String instanceRoleArn) {
            this.instanceRoleArn = Output.ofNullable(instanceRoleArn);
            return this;
        }

        public Builder memory(@Nullable Output<String> memory) {
            this.memory = memory;
            return this;
        }

        public Builder memory(@Nullable String memory) {
            this.memory = Output.ofNullable(memory);
            return this;
        }
        public ServiceInstanceConfigurationArgs build() {
            return new ServiceInstanceConfigurationArgs(cpu, instanceRoleArn, memory);
        }
    }
}
