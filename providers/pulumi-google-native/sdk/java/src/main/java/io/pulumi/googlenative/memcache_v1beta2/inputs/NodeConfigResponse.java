// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.memcache_v1beta2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * Configuration for a Memcached Node.
 * 
 */
public final class NodeConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final NodeConfigResponse Empty = new NodeConfigResponse();

    /**
     * Number of cpus per Memcached node.
     * 
     */
    @InputImport(name="cpuCount", required=true)
      private final Integer cpuCount;

    public Integer getCpuCount() {
        return this.cpuCount;
    }

    /**
     * Memory size in MiB for each Memcached node.
     * 
     */
    @InputImport(name="memorySizeMb", required=true)
      private final Integer memorySizeMb;

    public Integer getMemorySizeMb() {
        return this.memorySizeMb;
    }

    public NodeConfigResponse(
        Integer cpuCount,
        Integer memorySizeMb) {
        this.cpuCount = Objects.requireNonNull(cpuCount, "expected parameter 'cpuCount' to be non-null");
        this.memorySizeMb = Objects.requireNonNull(memorySizeMb, "expected parameter 'memorySizeMb' to be non-null");
    }

    private NodeConfigResponse() {
        this.cpuCount = null;
        this.memorySizeMb = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer cpuCount;
        private Integer memorySizeMb;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeConfigResponse defaults) {
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
        public NodeConfigResponse build() {
            return new NodeConfigResponse(cpuCount, memorySizeMb);
        }
    }
}
