// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.xray.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SamplingRuleUpdate extends io.pulumi.resources.InvokeArgs {

    public static final SamplingRuleUpdate Empty = new SamplingRuleUpdate();

    /**
     * Matches attributes derived from the request.
     * 
     */
    @Import(name="attributes")
      private final @Nullable Object attributes;

    public Optional<Object> getAttributes() {
        return this.attributes == null ? Optional.empty() : Optional.ofNullable(this.attributes);
    }

    /**
     * The percentage of matching requests to instrument, after the reservoir is exhausted.
     * 
     */
    @Import(name="fixedRate")
      private final @Nullable Double fixedRate;

    public Optional<Double> getFixedRate() {
        return this.fixedRate == null ? Optional.empty() : Optional.ofNullable(this.fixedRate);
    }

    /**
     * Matches the HTTP method from a request URL.
     * 
     */
    @Import(name="hTTPMethod")
      private final @Nullable String hTTPMethod;

    public Optional<String> getHTTPMethod() {
        return this.hTTPMethod == null ? Optional.empty() : Optional.ofNullable(this.hTTPMethod);
    }

    /**
     * Matches the hostname from a request URL.
     * 
     */
    @Import(name="host")
      private final @Nullable String host;

    public Optional<String> getHost() {
        return this.host == null ? Optional.empty() : Optional.ofNullable(this.host);
    }

    /**
     * The priority of the sampling rule.
     * 
     */
    @Import(name="priority")
      private final @Nullable Integer priority;

    public Optional<Integer> getPriority() {
        return this.priority == null ? Optional.empty() : Optional.ofNullable(this.priority);
    }

    /**
     * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
     * 
     */
    @Import(name="reservoirSize")
      private final @Nullable Integer reservoirSize;

    public Optional<Integer> getReservoirSize() {
        return this.reservoirSize == null ? Optional.empty() : Optional.ofNullable(this.reservoirSize);
    }

    /**
     * Matches the ARN of the AWS resource on which the service runs.
     * 
     */
    @Import(name="resourceARN")
      private final @Nullable String resourceARN;

    public Optional<String> getResourceARN() {
        return this.resourceARN == null ? Optional.empty() : Optional.ofNullable(this.resourceARN);
    }

    @Import(name="ruleARN")
      private final @Nullable String ruleARN;

    public Optional<String> getRuleARN() {
        return this.ruleARN == null ? Optional.empty() : Optional.ofNullable(this.ruleARN);
    }

    @Import(name="ruleName")
      private final @Nullable String ruleName;

    public Optional<String> getRuleName() {
        return this.ruleName == null ? Optional.empty() : Optional.ofNullable(this.ruleName);
    }

    /**
     * Matches the name that the service uses to identify itself in segments.
     * 
     */
    @Import(name="serviceName")
      private final @Nullable String serviceName;

    public Optional<String> getServiceName() {
        return this.serviceName == null ? Optional.empty() : Optional.ofNullable(this.serviceName);
    }

    /**
     * Matches the origin that the service uses to identify its type in segments.
     * 
     */
    @Import(name="serviceType")
      private final @Nullable String serviceType;

    public Optional<String> getServiceType() {
        return this.serviceType == null ? Optional.empty() : Optional.ofNullable(this.serviceType);
    }

    /**
     * Matches the path from a request URL.
     * 
     */
    @Import(name="uRLPath")
      private final @Nullable String uRLPath;

    public Optional<String> getURLPath() {
        return this.uRLPath == null ? Optional.empty() : Optional.ofNullable(this.uRLPath);
    }

    public SamplingRuleUpdate(
        @Nullable Object attributes,
        @Nullable Double fixedRate,
        @Nullable String hTTPMethod,
        @Nullable String host,
        @Nullable Integer priority,
        @Nullable Integer reservoirSize,
        @Nullable String resourceARN,
        @Nullable String ruleARN,
        @Nullable String ruleName,
        @Nullable String serviceName,
        @Nullable String serviceType,
        @Nullable String uRLPath) {
        this.attributes = attributes;
        this.fixedRate = fixedRate;
        this.hTTPMethod = hTTPMethod;
        this.host = host;
        this.priority = priority;
        this.reservoirSize = reservoirSize;
        this.resourceARN = resourceARN;
        this.ruleARN = ruleARN;
        this.ruleName = ruleName;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
        this.uRLPath = uRLPath;
    }

    private SamplingRuleUpdate() {
        this.attributes = null;
        this.fixedRate = null;
        this.hTTPMethod = null;
        this.host = null;
        this.priority = null;
        this.reservoirSize = null;
        this.resourceARN = null;
        this.ruleARN = null;
        this.ruleName = null;
        this.serviceName = null;
        this.serviceType = null;
        this.uRLPath = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SamplingRuleUpdate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object attributes;
        private @Nullable Double fixedRate;
        private @Nullable String hTTPMethod;
        private @Nullable String host;
        private @Nullable Integer priority;
        private @Nullable Integer reservoirSize;
        private @Nullable String resourceARN;
        private @Nullable String ruleARN;
        private @Nullable String ruleName;
        private @Nullable String serviceName;
        private @Nullable String serviceType;
        private @Nullable String uRLPath;

        public Builder() {
    	      // Empty
        }

        public Builder(SamplingRuleUpdate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.fixedRate = defaults.fixedRate;
    	      this.hTTPMethod = defaults.hTTPMethod;
    	      this.host = defaults.host;
    	      this.priority = defaults.priority;
    	      this.reservoirSize = defaults.reservoirSize;
    	      this.resourceARN = defaults.resourceARN;
    	      this.ruleARN = defaults.ruleARN;
    	      this.ruleName = defaults.ruleName;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceType = defaults.serviceType;
    	      this.uRLPath = defaults.uRLPath;
        }

        public Builder attributes(@Nullable Object attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder fixedRate(@Nullable Double fixedRate) {
            this.fixedRate = fixedRate;
            return this;
        }

        public Builder hTTPMethod(@Nullable String hTTPMethod) {
            this.hTTPMethod = hTTPMethod;
            return this;
        }

        public Builder host(@Nullable String host) {
            this.host = host;
            return this;
        }

        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder reservoirSize(@Nullable Integer reservoirSize) {
            this.reservoirSize = reservoirSize;
            return this;
        }

        public Builder resourceARN(@Nullable String resourceARN) {
            this.resourceARN = resourceARN;
            return this;
        }

        public Builder ruleARN(@Nullable String ruleARN) {
            this.ruleARN = ruleARN;
            return this;
        }

        public Builder ruleName(@Nullable String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        public Builder serviceName(@Nullable String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public Builder serviceType(@Nullable String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        public Builder uRLPath(@Nullable String uRLPath) {
            this.uRLPath = uRLPath;
            return this;
        }
        public SamplingRuleUpdate build() {
            return new SamplingRuleUpdate(attributes, fixedRate, hTTPMethod, host, priority, reservoirSize, resourceARN, ruleARN, ruleName, serviceName, serviceType, uRLPath);
        }
    }
}
