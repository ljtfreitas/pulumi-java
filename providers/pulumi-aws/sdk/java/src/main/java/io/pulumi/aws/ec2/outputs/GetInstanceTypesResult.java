// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetInstanceTypesFilter;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetInstanceTypesResult {
    private final @Nullable List<GetInstanceTypesFilter> filters;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * List of EC2 Instance Types.
     * 
     */
    private final List<String> instanceTypes;

    @CustomType.Constructor
    private GetInstanceTypesResult(
        @CustomType.Parameter("filters") @Nullable List<GetInstanceTypesFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceTypes") List<String> instanceTypes) {
        this.filters = filters;
        this.id = id;
        this.instanceTypes = instanceTypes;
    }

    public List<GetInstanceTypesFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * List of EC2 Instance Types.
     * 
    */
    public List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTypesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetInstanceTypesFilter> filters;
        private String id;
        private List<String> instanceTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTypesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.instanceTypes = defaults.instanceTypes;
        }

        public Builder filters(@Nullable List<GetInstanceTypesFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder instanceTypes(List<String> instanceTypes) {
            this.instanceTypes = Objects.requireNonNull(instanceTypes);
            return this;
        }
        public GetInstanceTypesResult build() {
            return new GetInstanceTypesResult(filters, id, instanceTypes);
        }
    }
}
