// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedPrefixListEntryGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedPrefixListEntryGetArgs Empty = new ManagedPrefixListEntryGetArgs();

    /**
     * CIDR block of this entry.
     * 
     */
    @InputImport(name="cidr", required=true)
    private final Input<String> cidr;

    public Input<String> getCidr() {
        return this.cidr;
    }

    /**
     * Description of this entry. Due to API limitations, updating only the description of an existing entry requires temporarily removing and re-adding the entry.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    public ManagedPrefixListEntryGetArgs(
        Input<String> cidr,
        @Nullable Input<String> description) {
        this.cidr = Objects.requireNonNull(cidr, "expected parameter 'cidr' to be non-null");
        this.description = description;
    }

    private ManagedPrefixListEntryGetArgs() {
        this.cidr = Input.empty();
        this.description = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedPrefixListEntryGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cidr;
        private @Nullable Input<String> description;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedPrefixListEntryGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.description = defaults.description;
        }

        public Builder setCidr(Input<String> cidr) {
            this.cidr = Objects.requireNonNull(cidr);
            return this;
        }

        public Builder setCidr(String cidr) {
            this.cidr = Input.of(Objects.requireNonNull(cidr));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }
        public ManagedPrefixListEntryGetArgs build() {
            return new ManagedPrefixListEntryGetArgs(cidr, description);
        }
    }
}
