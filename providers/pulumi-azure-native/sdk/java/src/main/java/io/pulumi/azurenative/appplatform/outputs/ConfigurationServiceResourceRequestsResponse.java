// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConfigurationServiceResourceRequestsResponse {
    /**
     * Cpu allocated to each Application Configuration Service instance
     * 
     */
    private final String cpu;
    /**
     * Instance count of the Application Configuration Service
     * 
     */
    private final Integer instanceCount;
    /**
     * Memory allocated to each Application Configuration Service instance
     * 
     */
    private final String memory;

    @OutputCustomType.Constructor({"cpu","instanceCount","memory"})
    private ConfigurationServiceResourceRequestsResponse(
        String cpu,
        Integer instanceCount,
        String memory) {
        this.cpu = Objects.requireNonNull(cpu);
        this.instanceCount = Objects.requireNonNull(instanceCount);
        this.memory = Objects.requireNonNull(memory);
    }

    /**
     * Cpu allocated to each Application Configuration Service instance
     * 
     */
    public String getCpu() {
        return this.cpu;
    }
    /**
     * Instance count of the Application Configuration Service
     * 
     */
    public Integer getInstanceCount() {
        return this.instanceCount;
    }
    /**
     * Memory allocated to each Application Configuration Service instance
     * 
     */
    public String getMemory() {
        return this.memory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationServiceResourceRequestsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cpu;
        private Integer instanceCount;
        private String memory;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationServiceResourceRequestsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.instanceCount = defaults.instanceCount;
    	      this.memory = defaults.memory;
        }

        public Builder setCpu(String cpu) {
            this.cpu = Objects.requireNonNull(cpu);
            return this;
        }

        public Builder setInstanceCount(Integer instanceCount) {
            this.instanceCount = Objects.requireNonNull(instanceCount);
            return this;
        }

        public Builder setMemory(String memory) {
            this.memory = Objects.requireNonNull(memory);
            return this;
        }

        public ConfigurationServiceResourceRequestsResponse build() {
            return new ConfigurationServiceResourceRequestsResponse(cpu, instanceCount, memory);
        }
    }
}
