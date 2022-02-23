// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetManagedPrefixListEntry {
    private final String cidr;
    private final String description;

    @OutputCustomType.Constructor({"cidr","description"})
    private GetManagedPrefixListEntry(
        String cidr,
        String description) {
        this.cidr = Objects.requireNonNull(cidr);
        this.description = Objects.requireNonNull(description);
    }

    public String getCidr() {
        return this.cidr;
    }
    public String getDescription() {
        return this.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedPrefixListEntry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cidr;
        private String description;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedPrefixListEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.description = defaults.description;
        }

        public Builder setCidr(String cidr) {
            this.cidr = Objects.requireNonNull(cidr);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public GetManagedPrefixListEntry build() {
            return new GetManagedPrefixListEntry(cidr, description);
        }
    }
}
