// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetImageOutputResourceAmi {
    /**
     * Account identifier of the AMI.
     * 
     */
    private final String accountId;
    /**
     * Description of the AMI.
     * 
     */
    private final String description;
    /**
     * Identifier of the AMI.
     * 
     */
    private final String image;
    /**
     * Name of the AMI.
     * 
     */
    private final String name;
    /**
     * Region of the AMI.
     * 
     */
    private final String region;

    @CustomType.Constructor
    private GetImageOutputResourceAmi(
        @CustomType.Parameter("accountId") String accountId,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("image") String image,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("region") String region) {
        this.accountId = accountId;
        this.description = description;
        this.image = image;
        this.name = name;
        this.region = region;
    }

    /**
     * Account identifier of the AMI.
     * 
    */
    public String getAccountId() {
        return this.accountId;
    }
    /**
     * Description of the AMI.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Identifier of the AMI.
     * 
    */
    public String getImage() {
        return this.image;
    }
    /**
     * Name of the AMI.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Region of the AMI.
     * 
    */
    public String getRegion() {
        return this.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageOutputResourceAmi defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;
        private String description;
        private String image;
        private String name;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageOutputResourceAmi defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.description = defaults.description;
    	      this.image = defaults.image;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
        }

        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder image(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public GetImageOutputResourceAmi build() {
            return new GetImageOutputResourceAmi(accountId, description, image, name, region);
        }
    }
}
