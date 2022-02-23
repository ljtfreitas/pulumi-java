// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outposts.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetOutpostInstanceTypesResult {
    private final String arn;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Set of instance types.
     * 
     */
    private final List<String> instanceTypes;

    @OutputCustomType.Constructor({"arn","id","instanceTypes"})
    private GetOutpostInstanceTypesResult(
        String arn,
        String id,
        List<String> instanceTypes) {
        this.arn = Objects.requireNonNull(arn);
        this.id = Objects.requireNonNull(id);
        this.instanceTypes = Objects.requireNonNull(instanceTypes);
    }

    public String getArn() {
        return this.arn;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Set of instance types.
     * 
     */
    public List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOutpostInstanceTypesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String id;
        private List<String> instanceTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOutpostInstanceTypesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.instanceTypes = defaults.instanceTypes;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInstanceTypes(List<String> instanceTypes) {
            this.instanceTypes = Objects.requireNonNull(instanceTypes);
            return this;
        }
        public GetOutpostInstanceTypesResult build() {
            return new GetOutpostInstanceTypesResult(arn, id, instanceTypes);
        }
    }
}
