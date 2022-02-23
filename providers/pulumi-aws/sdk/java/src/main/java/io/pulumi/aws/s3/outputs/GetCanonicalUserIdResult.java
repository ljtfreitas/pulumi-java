// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetCanonicalUserIdResult {
    /**
     * The human-friendly name linked to the canonical user ID. The bucket owner's display name. **NOTE:** [This value](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTServiceGET.html) is only included in the response in the US East (N. Virginia), US West (N. California), US West (Oregon), Asia Pacific (Singapore), Asia Pacific (Sydney), Asia Pacific (Tokyo), EU (Ireland), and South America (São Paulo) regions.
     * 
     */
    private final String displayName;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;

    @OutputCustomType.Constructor({"displayName","id"})
    private GetCanonicalUserIdResult(
        String displayName,
        String id) {
        this.displayName = Objects.requireNonNull(displayName);
        this.id = Objects.requireNonNull(id);
    }

    /**
     * The human-friendly name linked to the canonical user ID. The bucket owner's display name. **NOTE:** [This value](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTServiceGET.html) is only included in the response in the US East (N. Virginia), US West (N. California), US West (Oregon), Asia Pacific (Singapore), Asia Pacific (Sydney), Asia Pacific (Tokyo), EU (Ireland), and South America (São Paulo) regions.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCanonicalUserIdResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCanonicalUserIdResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetCanonicalUserIdResult build() {
            return new GetCanonicalUserIdResult(displayName, id);
        }
    }
}
