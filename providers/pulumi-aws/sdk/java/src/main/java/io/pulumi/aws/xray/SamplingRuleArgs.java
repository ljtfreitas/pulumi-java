// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.xray;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SamplingRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final SamplingRuleArgs Empty = new SamplingRuleArgs();

    /**
     * Matches attributes derived from the request.
     * 
     */
    @InputImport(name="attributes")
    private final @Nullable Input<Map<String,String>> attributes;

    public Input<Map<String,String>> getAttributes() {
        return this.attributes == null ? Input.empty() : this.attributes;
    }

    /**
     * The percentage of matching requests to instrument, after the reservoir is exhausted.
     * 
     */
    @InputImport(name="fixedRate", required=true)
    private final Input<Double> fixedRate;

    public Input<Double> getFixedRate() {
        return this.fixedRate;
    }

    /**
     * Matches the hostname from a request URL.
     * 
     */
    @InputImport(name="host", required=true)
    private final Input<String> host;

    public Input<String> getHost() {
        return this.host;
    }

    /**
     * Matches the HTTP method of a request.
     * 
     */
    @InputImport(name="httpMethod", required=true)
    private final Input<String> httpMethod;

    public Input<String> getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * The priority of the sampling rule.
     * 
     */
    @InputImport(name="priority", required=true)
    private final Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority;
    }

    /**
     * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
     * 
     */
    @InputImport(name="reservoirSize", required=true)
    private final Input<Integer> reservoirSize;

    public Input<Integer> getReservoirSize() {
        return this.reservoirSize;
    }

    /**
     * Matches the ARN of the AWS resource on which the service runs.
     * 
     */
    @InputImport(name="resourceArn", required=true)
    private final Input<String> resourceArn;

    public Input<String> getResourceArn() {
        return this.resourceArn;
    }

    /**
     * The name of the sampling rule.
     * 
     */
    @InputImport(name="ruleName")
    private final @Nullable Input<String> ruleName;

    public Input<String> getRuleName() {
        return this.ruleName == null ? Input.empty() : this.ruleName;
    }

    /**
     * Matches the `name` that the service uses to identify itself in segments.
     * 
     */
    @InputImport(name="serviceName", required=true)
    private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    /**
     * Matches the `origin` that the service uses to identify its type in segments.
     * 
     */
    @InputImport(name="serviceType", required=true)
    private final Input<String> serviceType;

    public Input<String> getServiceType() {
        return this.serviceType;
    }

    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Matches the path from a request URL.
     * 
     */
    @InputImport(name="urlPath", required=true)
    private final Input<String> urlPath;

    public Input<String> getUrlPath() {
        return this.urlPath;
    }

    /**
     * The version of the sampling rule format (`1` )
     * 
     */
    @InputImport(name="version", required=true)
    private final Input<Integer> version;

    public Input<Integer> getVersion() {
        return this.version;
    }

    public SamplingRuleArgs(
        @Nullable Input<Map<String,String>> attributes,
        Input<Double> fixedRate,
        Input<String> host,
        Input<String> httpMethod,
        Input<Integer> priority,
        Input<Integer> reservoirSize,
        Input<String> resourceArn,
        @Nullable Input<String> ruleName,
        Input<String> serviceName,
        Input<String> serviceType,
        @Nullable Input<Map<String,String>> tags,
        Input<String> urlPath,
        Input<Integer> version) {
        this.attributes = attributes;
        this.fixedRate = Objects.requireNonNull(fixedRate, "expected parameter 'fixedRate' to be non-null");
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.httpMethod = Objects.requireNonNull(httpMethod, "expected parameter 'httpMethod' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.reservoirSize = Objects.requireNonNull(reservoirSize, "expected parameter 'reservoirSize' to be non-null");
        this.resourceArn = Objects.requireNonNull(resourceArn, "expected parameter 'resourceArn' to be non-null");
        this.ruleName = ruleName;
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.serviceType = Objects.requireNonNull(serviceType, "expected parameter 'serviceType' to be non-null");
        this.tags = tags;
        this.urlPath = Objects.requireNonNull(urlPath, "expected parameter 'urlPath' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private SamplingRuleArgs() {
        this.attributes = Input.empty();
        this.fixedRate = Input.empty();
        this.host = Input.empty();
        this.httpMethod = Input.empty();
        this.priority = Input.empty();
        this.reservoirSize = Input.empty();
        this.resourceArn = Input.empty();
        this.ruleName = Input.empty();
        this.serviceName = Input.empty();
        this.serviceType = Input.empty();
        this.tags = Input.empty();
        this.urlPath = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SamplingRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> attributes;
        private Input<Double> fixedRate;
        private Input<String> host;
        private Input<String> httpMethod;
        private Input<Integer> priority;
        private Input<Integer> reservoirSize;
        private Input<String> resourceArn;
        private @Nullable Input<String> ruleName;
        private Input<String> serviceName;
        private Input<String> serviceType;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> urlPath;
        private Input<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(SamplingRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.fixedRate = defaults.fixedRate;
    	      this.host = defaults.host;
    	      this.httpMethod = defaults.httpMethod;
    	      this.priority = defaults.priority;
    	      this.reservoirSize = defaults.reservoirSize;
    	      this.resourceArn = defaults.resourceArn;
    	      this.ruleName = defaults.ruleName;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceType = defaults.serviceType;
    	      this.tags = defaults.tags;
    	      this.urlPath = defaults.urlPath;
    	      this.version = defaults.version;
        }

        public Builder setAttributes(@Nullable Input<Map<String,String>> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder setAttributes(@Nullable Map<String,String> attributes) {
            this.attributes = Input.ofNullable(attributes);
            return this;
        }

        public Builder setFixedRate(Input<Double> fixedRate) {
            this.fixedRate = Objects.requireNonNull(fixedRate);
            return this;
        }

        public Builder setFixedRate(Double fixedRate) {
            this.fixedRate = Input.of(Objects.requireNonNull(fixedRate));
            return this;
        }

        public Builder setHost(Input<String> host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setHost(String host) {
            this.host = Input.of(Objects.requireNonNull(host));
            return this;
        }

        public Builder setHttpMethod(Input<String> httpMethod) {
            this.httpMethod = Objects.requireNonNull(httpMethod);
            return this;
        }

        public Builder setHttpMethod(String httpMethod) {
            this.httpMethod = Input.of(Objects.requireNonNull(httpMethod));
            return this;
        }

        public Builder setPriority(Input<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Input.of(Objects.requireNonNull(priority));
            return this;
        }

        public Builder setReservoirSize(Input<Integer> reservoirSize) {
            this.reservoirSize = Objects.requireNonNull(reservoirSize);
            return this;
        }

        public Builder setReservoirSize(Integer reservoirSize) {
            this.reservoirSize = Input.of(Objects.requireNonNull(reservoirSize));
            return this;
        }

        public Builder setResourceArn(Input<String> resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }

        public Builder setResourceArn(String resourceArn) {
            this.resourceArn = Input.of(Objects.requireNonNull(resourceArn));
            return this;
        }

        public Builder setRuleName(@Nullable Input<String> ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        public Builder setRuleName(@Nullable String ruleName) {
            this.ruleName = Input.ofNullable(ruleName);
            return this;
        }

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }

        public Builder setServiceType(Input<String> serviceType) {
            this.serviceType = Objects.requireNonNull(serviceType);
            return this;
        }

        public Builder setServiceType(String serviceType) {
            this.serviceType = Input.of(Objects.requireNonNull(serviceType));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setUrlPath(Input<String> urlPath) {
            this.urlPath = Objects.requireNonNull(urlPath);
            return this;
        }

        public Builder setUrlPath(String urlPath) {
            this.urlPath = Input.of(Objects.requireNonNull(urlPath));
            return this;
        }

        public Builder setVersion(Input<Integer> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public Builder setVersion(Integer version) {
            this.version = Input.of(Objects.requireNonNull(version));
            return this;
        }
        public SamplingRuleArgs build() {
            return new SamplingRuleArgs(attributes, fixedRate, host, httpMethod, priority, reservoirSize, resourceArn, ruleName, serviceName, serviceType, tags, urlPath, version);
        }
    }
}