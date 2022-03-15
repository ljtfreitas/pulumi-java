// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Instance Configuration
 * 
 */
public final class ServiceInstanceConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final ServiceInstanceConfiguration Empty = new ServiceInstanceConfiguration();

    /**
     * CPU
     * 
     */
    @Import(name="cpu")
      private final @Nullable String cpu;

    public Optional<String> getCpu() {
        return this.cpu == null ? Optional.empty() : Optional.ofNullable(this.cpu);
    }

    /**
     * Instance Role Arn
     * 
     */
    @Import(name="instanceRoleArn")
      private final @Nullable String instanceRoleArn;

    public Optional<String> getInstanceRoleArn() {
        return this.instanceRoleArn == null ? Optional.empty() : Optional.ofNullable(this.instanceRoleArn);
    }

    /**
     * Memory
     * 
     */
    @Import(name="memory")
      private final @Nullable String memory;

    public Optional<String> getMemory() {
        return this.memory == null ? Optional.empty() : Optional.ofNullable(this.memory);
    }

    public ServiceInstanceConfiguration(
        @Nullable String cpu,
        @Nullable String instanceRoleArn,
        @Nullable String memory) {
        this.cpu = cpu;
        this.instanceRoleArn = instanceRoleArn;
        this.memory = memory;
    }

    private ServiceInstanceConfiguration() {
        this.cpu = null;
        this.instanceRoleArn = null;
        this.memory = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceInstanceConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cpu;
        private @Nullable String instanceRoleArn;
        private @Nullable String memory;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceInstanceConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.instanceRoleArn = defaults.instanceRoleArn;
    	      this.memory = defaults.memory;
        }

        public Builder cpu(@Nullable String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder instanceRoleArn(@Nullable String instanceRoleArn) {
            this.instanceRoleArn = instanceRoleArn;
            return this;
        }

        public Builder memory(@Nullable String memory) {
            this.memory = memory;
            return this;
        }
        public ServiceInstanceConfiguration build() {
            return new ServiceInstanceConfiguration(cpu, instanceRoleArn, memory);
        }
    }
}
