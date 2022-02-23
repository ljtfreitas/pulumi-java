// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.memcache.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class InstanceNodeConfig {
    /**
     * Number of CPUs per node.
     * 
     */
    private final Integer cpuCount;
    /**
     * Memory size in Mebibytes for each memcache node.
     * 
     */
    private final Integer memorySizeMb;

    @OutputCustomType.Constructor({"cpuCount","memorySizeMb"})
    private InstanceNodeConfig(
        Integer cpuCount,
        Integer memorySizeMb) {
        this.cpuCount = Objects.requireNonNull(cpuCount);
        this.memorySizeMb = Objects.requireNonNull(memorySizeMb);
    }

    /**
     * Number of CPUs per node.
     * 
     */
    public Integer getCpuCount() {
        return this.cpuCount;
    }
    /**
     * Memory size in Mebibytes for each memcache node.
     * 
     */
    public Integer getMemorySizeMb() {
        return this.memorySizeMb;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceNodeConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer cpuCount;
        private Integer memorySizeMb;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceNodeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCount = defaults.cpuCount;
    	      this.memorySizeMb = defaults.memorySizeMb;
        }

        public Builder setCpuCount(Integer cpuCount) {
            this.cpuCount = Objects.requireNonNull(cpuCount);
            return this;
        }

        public Builder setMemorySizeMb(Integer memorySizeMb) {
            this.memorySizeMb = Objects.requireNonNull(memorySizeMb);
            return this;
        }
        public InstanceNodeConfig build() {
            return new InstanceNodeConfig(cpuCount, memorySizeMb);
        }
    }
}
