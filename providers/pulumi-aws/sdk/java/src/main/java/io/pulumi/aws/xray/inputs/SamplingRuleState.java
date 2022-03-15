// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.xray.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SamplingRuleState extends io.pulumi.resources.ResourceArgs {

    public static final SamplingRuleState Empty = new SamplingRuleState();

    /**
     * The ARN of the sampling rule.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Matches attributes derived from the request.
     * 
     */
    @Import(name="attributes")
      private final @Nullable Output<Map<String,String>> attributes;

    public Output<Map<String,String>> getAttributes() {
        return this.attributes == null ? Output.empty() : this.attributes;
    }

    /**
     * The percentage of matching requests to instrument, after the reservoir is exhausted.
     * 
     */
    @Import(name="fixedRate")
      private final @Nullable Output<Double> fixedRate;

    public Output<Double> getFixedRate() {
        return this.fixedRate == null ? Output.empty() : this.fixedRate;
    }

    /**
     * Matches the hostname from a request URL.
     * 
     */
    @Import(name="host")
      private final @Nullable Output<String> host;

    public Output<String> getHost() {
        return this.host == null ? Output.empty() : this.host;
    }

    /**
     * Matches the HTTP method of a request.
     * 
     */
    @Import(name="httpMethod")
      private final @Nullable Output<String> httpMethod;

    public Output<String> getHttpMethod() {
        return this.httpMethod == null ? Output.empty() : this.httpMethod;
    }

    /**
     * The priority of the sampling rule.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority == null ? Output.empty() : this.priority;
    }

    /**
     * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
     * 
     */
    @Import(name="reservoirSize")
      private final @Nullable Output<Integer> reservoirSize;

    public Output<Integer> getReservoirSize() {
        return this.reservoirSize == null ? Output.empty() : this.reservoirSize;
    }

    /**
     * Matches the ARN of the AWS resource on which the service runs.
     * 
     */
    @Import(name="resourceArn")
      private final @Nullable Output<String> resourceArn;

    public Output<String> getResourceArn() {
        return this.resourceArn == null ? Output.empty() : this.resourceArn;
    }

    /**
     * The name of the sampling rule.
     * 
     */
    @Import(name="ruleName")
      private final @Nullable Output<String> ruleName;

    public Output<String> getRuleName() {
        return this.ruleName == null ? Output.empty() : this.ruleName;
    }

    /**
     * Matches the `name` that the service uses to identify itself in segments.
     * 
     */
    @Import(name="serviceName")
      private final @Nullable Output<String> serviceName;

    public Output<String> getServiceName() {
        return this.serviceName == null ? Output.empty() : this.serviceName;
    }

    /**
     * Matches the `origin` that the service uses to identify its type in segments.
     * 
     */
    @Import(name="serviceType")
      private final @Nullable Output<String> serviceType;

    public Output<String> getServiceType() {
        return this.serviceType == null ? Output.empty() : this.serviceType;
    }

    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * Matches the path from a request URL.
     * 
     */
    @Import(name="urlPath")
      private final @Nullable Output<String> urlPath;

    public Output<String> getUrlPath() {
        return this.urlPath == null ? Output.empty() : this.urlPath;
    }

    /**
     * The version of the sampling rule format (`1` )
     * 
     */
    @Import(name="version")
      private final @Nullable Output<Integer> version;

    public Output<Integer> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public SamplingRuleState(
        @Nullable Output<String> arn,
        @Nullable Output<Map<String,String>> attributes,
        @Nullable Output<Double> fixedRate,
        @Nullable Output<String> host,
        @Nullable Output<String> httpMethod,
        @Nullable Output<Integer> priority,
        @Nullable Output<Integer> reservoirSize,
        @Nullable Output<String> resourceArn,
        @Nullable Output<String> ruleName,
        @Nullable Output<String> serviceName,
        @Nullable Output<String> serviceType,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> urlPath,
        @Nullable Output<Integer> version) {
        this.arn = arn;
        this.attributes = attributes;
        this.fixedRate = fixedRate;
        this.host = host;
        this.httpMethod = httpMethod;
        this.priority = priority;
        this.reservoirSize = reservoirSize;
        this.resourceArn = resourceArn;
        this.ruleName = ruleName;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.urlPath = urlPath;
        this.version = version;
    }

    private SamplingRuleState() {
        this.arn = Output.empty();
        this.attributes = Output.empty();
        this.fixedRate = Output.empty();
        this.host = Output.empty();
        this.httpMethod = Output.empty();
        this.priority = Output.empty();
        this.reservoirSize = Output.empty();
        this.resourceArn = Output.empty();
        this.ruleName = Output.empty();
        this.serviceName = Output.empty();
        this.serviceType = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.urlPath = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SamplingRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<Map<String,String>> attributes;
        private @Nullable Output<Double> fixedRate;
        private @Nullable Output<String> host;
        private @Nullable Output<String> httpMethod;
        private @Nullable Output<Integer> priority;
        private @Nullable Output<Integer> reservoirSize;
        private @Nullable Output<String> resourceArn;
        private @Nullable Output<String> ruleName;
        private @Nullable Output<String> serviceName;
        private @Nullable Output<String> serviceType;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> urlPath;
        private @Nullable Output<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(SamplingRuleState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
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
    	      this.tagsAll = defaults.tagsAll;
    	      this.urlPath = defaults.urlPath;
    	      this.version = defaults.version;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder attributes(@Nullable Output<Map<String,String>> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder attributes(@Nullable Map<String,String> attributes) {
            this.attributes = Output.ofNullable(attributes);
            return this;
        }

        public Builder fixedRate(@Nullable Output<Double> fixedRate) {
            this.fixedRate = fixedRate;
            return this;
        }

        public Builder fixedRate(@Nullable Double fixedRate) {
            this.fixedRate = Output.ofNullable(fixedRate);
            return this;
        }

        public Builder host(@Nullable Output<String> host) {
            this.host = host;
            return this;
        }

        public Builder host(@Nullable String host) {
            this.host = Output.ofNullable(host);
            return this;
        }

        public Builder httpMethod(@Nullable Output<String> httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }

        public Builder httpMethod(@Nullable String httpMethod) {
            this.httpMethod = Output.ofNullable(httpMethod);
            return this;
        }

        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder priority(@Nullable Integer priority) {
            this.priority = Output.ofNullable(priority);
            return this;
        }

        public Builder reservoirSize(@Nullable Output<Integer> reservoirSize) {
            this.reservoirSize = reservoirSize;
            return this;
        }

        public Builder reservoirSize(@Nullable Integer reservoirSize) {
            this.reservoirSize = Output.ofNullable(reservoirSize);
            return this;
        }

        public Builder resourceArn(@Nullable Output<String> resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }

        public Builder resourceArn(@Nullable String resourceArn) {
            this.resourceArn = Output.ofNullable(resourceArn);
            return this;
        }

        public Builder ruleName(@Nullable Output<String> ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        public Builder ruleName(@Nullable String ruleName) {
            this.ruleName = Output.ofNullable(ruleName);
            return this;
        }

        public Builder serviceName(@Nullable Output<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        public Builder serviceName(@Nullable String serviceName) {
            this.serviceName = Output.ofNullable(serviceName);
            return this;
        }

        public Builder serviceType(@Nullable Output<String> serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        public Builder serviceType(@Nullable String serviceType) {
            this.serviceType = Output.ofNullable(serviceType);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }

        public Builder urlPath(@Nullable Output<String> urlPath) {
            this.urlPath = urlPath;
            return this;
        }

        public Builder urlPath(@Nullable String urlPath) {
            this.urlPath = Output.ofNullable(urlPath);
            return this;
        }

        public Builder version(@Nullable Output<Integer> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable Integer version) {
            this.version = Output.ofNullable(version);
            return this;
        }
        public SamplingRuleState build() {
            return new SamplingRuleState(arn, attributes, fixedRate, host, httpMethod, priority, reservoirSize, resourceArn, ruleName, serviceName, serviceType, tags, tagsAll, urlPath, version);
        }
    }
}
