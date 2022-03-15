// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mskconnect.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWorkerConfigurationResult {
    /**
     * the Amazon Resource Name (ARN) of the worker configuration.
     * 
     */
    private final String arn;
    /**
     * a summary description of the worker configuration.
     * 
     */
    private final String description;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * an ID of the latest successfully created revision of the worker configuration.
     * 
     */
    private final Integer latestRevision;
    private final String name;
    /**
     * contents of connect-distributed.properties file.
     * 
     */
    private final String propertiesFileContent;

    @CustomType.Constructor
    private GetWorkerConfigurationResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("latestRevision") Integer latestRevision,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("propertiesFileContent") String propertiesFileContent) {
        this.arn = arn;
        this.description = description;
        this.id = id;
        this.latestRevision = latestRevision;
        this.name = name;
        this.propertiesFileContent = propertiesFileContent;
    }

    /**
     * the Amazon Resource Name (ARN) of the worker configuration.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * a summary description of the worker configuration.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * an ID of the latest successfully created revision of the worker configuration.
     * 
    */
    public Integer getLatestRevision() {
        return this.latestRevision;
    }
    public String getName() {
        return this.name;
    }
    /**
     * contents of connect-distributed.properties file.
     * 
    */
    public String getPropertiesFileContent() {
        return this.propertiesFileContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkerConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String description;
        private String id;
        private Integer latestRevision;
        private String name;
        private String propertiesFileContent;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkerConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.latestRevision = defaults.latestRevision;
    	      this.name = defaults.name;
    	      this.propertiesFileContent = defaults.propertiesFileContent;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder latestRevision(Integer latestRevision) {
            this.latestRevision = Objects.requireNonNull(latestRevision);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder propertiesFileContent(String propertiesFileContent) {
            this.propertiesFileContent = Objects.requireNonNull(propertiesFileContent);
            return this;
        }
        public GetWorkerConfigurationResult build() {
            return new GetWorkerConfigurationResult(arn, description, id, latestRevision, name, propertiesFileContent);
        }
    }
}
