// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedPrefixListEntryState extends io.pulumi.resources.ResourceArgs {

    public static final ManagedPrefixListEntryState Empty = new ManagedPrefixListEntryState();

    /**
     * CIDR block of this entry.
     * 
     */
    @Import(name="cidr")
      private final @Nullable Output<String> cidr;

    public Output<String> getCidr() {
        return this.cidr == null ? Output.empty() : this.cidr;
    }

    /**
     * Description of this entry. Due to API limitations, updating only the description of an entry requires recreating the entry.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * CIDR block of this entry.
     * 
     */
    @Import(name="prefixListId")
      private final @Nullable Output<String> prefixListId;

    public Output<String> getPrefixListId() {
        return this.prefixListId == null ? Output.empty() : this.prefixListId;
    }

    public ManagedPrefixListEntryState(
        @Nullable Output<String> cidr,
        @Nullable Output<String> description,
        @Nullable Output<String> prefixListId) {
        this.cidr = cidr;
        this.description = description;
        this.prefixListId = prefixListId;
    }

    private ManagedPrefixListEntryState() {
        this.cidr = Output.empty();
        this.description = Output.empty();
        this.prefixListId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedPrefixListEntryState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cidr;
        private @Nullable Output<String> description;
        private @Nullable Output<String> prefixListId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedPrefixListEntryState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.description = defaults.description;
    	      this.prefixListId = defaults.prefixListId;
        }

        public Builder cidr(@Nullable Output<String> cidr) {
            this.cidr = cidr;
            return this;
        }

        public Builder cidr(@Nullable String cidr) {
            this.cidr = Output.ofNullable(cidr);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder prefixListId(@Nullable Output<String> prefixListId) {
            this.prefixListId = prefixListId;
            return this;
        }

        public Builder prefixListId(@Nullable String prefixListId) {
            this.prefixListId = Output.ofNullable(prefixListId);
            return this;
        }
        public ManagedPrefixListEntryState build() {
            return new ManagedPrefixListEntryState(cidr, description, prefixListId);
        }
    }
}
