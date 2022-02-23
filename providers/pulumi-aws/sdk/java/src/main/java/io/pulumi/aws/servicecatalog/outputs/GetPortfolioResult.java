// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPortfolioResult {
    private final @Nullable String acceptLanguage;
    /**
     * Portfolio ARN.
     * 
     */
    private final String arn;
    /**
     * Time the portfolio was created.
     * 
     */
    private final String createdTime;
    /**
     * Description of the portfolio
     * 
     */
    private final String description;
    private final String id;
    /**
     * Portfolio name.
     * 
     */
    private final String name;
    /**
     * Name of the person or organization who owns the portfolio.
     * 
     */
    private final String providerName;
    /**
     * Tags applied to the portfolio.
     * 
     */
    private final Map<String,String> tags;

    @OutputCustomType.Constructor({"acceptLanguage","arn","createdTime","description","id","name","providerName","tags"})
    private GetPortfolioResult(
        @Nullable String acceptLanguage,
        String arn,
        String createdTime,
        String description,
        String id,
        String name,
        String providerName,
        Map<String,String> tags) {
        this.acceptLanguage = acceptLanguage;
        this.arn = Objects.requireNonNull(arn);
        this.createdTime = Objects.requireNonNull(createdTime);
        this.description = Objects.requireNonNull(description);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.providerName = Objects.requireNonNull(providerName);
        this.tags = Objects.requireNonNull(tags);
    }

    public Optional<String> getAcceptLanguage() {
        return Optional.ofNullable(this.acceptLanguage);
    }
    /**
     * Portfolio ARN.
     * 
     */
    public String getArn() {
        return this.arn;
    }
    /**
     * Time the portfolio was created.
     * 
     */
    public String getCreatedTime() {
        return this.createdTime;
    }
    /**
     * Description of the portfolio
     * 
     */
    public String getDescription() {
        return this.description;
    }
    public String getId() {
        return this.id;
    }
    /**
     * Portfolio name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Name of the person or organization who owns the portfolio.
     * 
     */
    public String getProviderName() {
        return this.providerName;
    }
    /**
     * Tags applied to the portfolio.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPortfolioResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String acceptLanguage;
        private String arn;
        private String createdTime;
        private String description;
        private String id;
        private String name;
        private String providerName;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPortfolioResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.providerName = defaults.providerName;
    	      this.tags = defaults.tags;
        }

        public Builder setAcceptLanguage(@Nullable String acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setCreatedTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProviderName(String providerName) {
            this.providerName = Objects.requireNonNull(providerName);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetPortfolioResult build() {
            return new GetPortfolioResult(acceptLanguage, arn, createdTime, description, id, name, providerName, tags);
        }
    }
}
