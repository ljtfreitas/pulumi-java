// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPartitionResult {
    /**
     * Base DNS domain name for the current partition (e.g., `amazonaws.com` in AWS Commercial, `amazonaws.com.cn` in AWS China).
     * 
     */
    private final String dnsSuffix;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Identifier of the current partition (e.g., `aws` in AWS Commercial, `aws-cn` in AWS China).
     * 
     */
    private final String partition;
    /**
     * Prefix of service names (e.g., `com.amazonaws` in AWS Commercial, `cn.com.amazonaws` in AWS China).
     * 
     */
    private final String reverseDnsPrefix;

    @CustomType.Constructor
    private GetPartitionResult(
        @CustomType.Parameter("dnsSuffix") String dnsSuffix,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("partition") String partition,
        @CustomType.Parameter("reverseDnsPrefix") String reverseDnsPrefix) {
        this.dnsSuffix = dnsSuffix;
        this.id = id;
        this.partition = partition;
        this.reverseDnsPrefix = reverseDnsPrefix;
    }

    /**
     * Base DNS domain name for the current partition (e.g., `amazonaws.com` in AWS Commercial, `amazonaws.com.cn` in AWS China).
     * 
    */
    public String getDnsSuffix() {
        return this.dnsSuffix;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Identifier of the current partition (e.g., `aws` in AWS Commercial, `aws-cn` in AWS China).
     * 
    */
    public String getPartition() {
        return this.partition;
    }
    /**
     * Prefix of service names (e.g., `com.amazonaws` in AWS Commercial, `cn.com.amazonaws` in AWS China).
     * 
    */
    public String getReverseDnsPrefix() {
        return this.reverseDnsPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPartitionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dnsSuffix;
        private String id;
        private String partition;
        private String reverseDnsPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPartitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsSuffix = defaults.dnsSuffix;
    	      this.id = defaults.id;
    	      this.partition = defaults.partition;
    	      this.reverseDnsPrefix = defaults.reverseDnsPrefix;
        }

        public Builder dnsSuffix(String dnsSuffix) {
            this.dnsSuffix = Objects.requireNonNull(dnsSuffix);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder partition(String partition) {
            this.partition = Objects.requireNonNull(partition);
            return this;
        }

        public Builder reverseDnsPrefix(String reverseDnsPrefix) {
            this.reverseDnsPrefix = Objects.requireNonNull(reverseDnsPrefix);
            return this;
        }
        public GetPartitionResult build() {
            return new GetPartitionResult(dnsSuffix, id, partition, reverseDnsPrefix);
        }
    }
}
