// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.serverlessrepository.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApplicationResult {
    /**
     * The ARN of the application.
     * 
     */
    private final String applicationId;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The name of the application.
     * 
     */
    private final String name;
    /**
     * A list of capabilities describing the permissions needed to deploy the application.
     * 
     */
    private final List<String> requiredCapabilities;
    private final String semanticVersion;
    /**
     * A URL pointing to the source code of the application version.
     * 
     */
    private final String sourceCodeUrl;
    /**
     * A URL pointing to the Cloud Formation template for the application version.
     * 
     */
    private final String templateUrl;

    @CustomType.Constructor
    private GetApplicationResult(
        @CustomType.Parameter("applicationId") String applicationId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("requiredCapabilities") List<String> requiredCapabilities,
        @CustomType.Parameter("semanticVersion") String semanticVersion,
        @CustomType.Parameter("sourceCodeUrl") String sourceCodeUrl,
        @CustomType.Parameter("templateUrl") String templateUrl) {
        this.applicationId = applicationId;
        this.id = id;
        this.name = name;
        this.requiredCapabilities = requiredCapabilities;
        this.semanticVersion = semanticVersion;
        this.sourceCodeUrl = sourceCodeUrl;
        this.templateUrl = templateUrl;
    }

    /**
     * The ARN of the application.
     * 
    */
    public String getApplicationId() {
        return this.applicationId;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the application.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * A list of capabilities describing the permissions needed to deploy the application.
     * 
    */
    public List<String> getRequiredCapabilities() {
        return this.requiredCapabilities;
    }
    public String getSemanticVersion() {
        return this.semanticVersion;
    }
    /**
     * A URL pointing to the source code of the application version.
     * 
    */
    public String getSourceCodeUrl() {
        return this.sourceCodeUrl;
    }
    /**
     * A URL pointing to the Cloud Formation template for the application version.
     * 
    */
    public String getTemplateUrl() {
        return this.templateUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationId;
        private String id;
        private String name;
        private List<String> requiredCapabilities;
        private String semanticVersion;
        private String sourceCodeUrl;
        private String templateUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.requiredCapabilities = defaults.requiredCapabilities;
    	      this.semanticVersion = defaults.semanticVersion;
    	      this.sourceCodeUrl = defaults.sourceCodeUrl;
    	      this.templateUrl = defaults.templateUrl;
        }

        public Builder applicationId(String applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder requiredCapabilities(List<String> requiredCapabilities) {
            this.requiredCapabilities = Objects.requireNonNull(requiredCapabilities);
            return this;
        }

        public Builder semanticVersion(String semanticVersion) {
            this.semanticVersion = Objects.requireNonNull(semanticVersion);
            return this;
        }

        public Builder sourceCodeUrl(String sourceCodeUrl) {
            this.sourceCodeUrl = Objects.requireNonNull(sourceCodeUrl);
            return this;
        }

        public Builder templateUrl(String templateUrl) {
            this.templateUrl = Objects.requireNonNull(templateUrl);
            return this;
        }
        public GetApplicationResult build() {
            return new GetApplicationResult(applicationId, id, name, requiredCapabilities, semanticVersion, sourceCodeUrl, templateUrl);
        }
    }
}
