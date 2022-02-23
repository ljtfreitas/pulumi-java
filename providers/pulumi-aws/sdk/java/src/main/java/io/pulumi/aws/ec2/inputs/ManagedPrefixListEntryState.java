// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedPrefixListEntryState extends io.pulumi.resources.ResourceArgs {

    public static final ManagedPrefixListEntryState Empty = new ManagedPrefixListEntryState();

    /**
     * CIDR block of this entry.
     * 
     */
    @InputImport(name="cidr")
    private final @Nullable Input<String> cidr;

    public Input<String> getCidr() {
        return this.cidr == null ? Input.empty() : this.cidr;
    }

    /**
     * Description of this entry. Due to API limitations, updating only the description of an entry requires recreating the entry.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * CIDR block of this entry.
     * 
     */
    @InputImport(name="prefixListId")
    private final @Nullable Input<String> prefixListId;

    public Input<String> getPrefixListId() {
        return this.prefixListId == null ? Input.empty() : this.prefixListId;
    }

    public ManagedPrefixListEntryState(
        @Nullable Input<String> cidr,
        @Nullable Input<String> description,
        @Nullable Input<String> prefixListId) {
        this.cidr = cidr;
        this.description = description;
        this.prefixListId = prefixListId;
    }

    private ManagedPrefixListEntryState() {
        this.cidr = Input.empty();
        this.description = Input.empty();
        this.prefixListId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedPrefixListEntryState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cidr;
        private @Nullable Input<String> description;
        private @Nullable Input<String> prefixListId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedPrefixListEntryState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.description = defaults.description;
    	      this.prefixListId = defaults.prefixListId;
        }

        public Builder setCidr(@Nullable Input<String> cidr) {
            this.cidr = cidr;
            return this;
        }

        public Builder setCidr(@Nullable String cidr) {
            this.cidr = Input.ofNullable(cidr);
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

        public Builder setPrefixListId(@Nullable Input<String> prefixListId) {
            this.prefixListId = prefixListId;
            return this;
        }

        public Builder setPrefixListId(@Nullable String prefixListId) {
            this.prefixListId = Input.ofNullable(prefixListId);
            return this;
        }
        public ManagedPrefixListEntryState build() {
            return new ManagedPrefixListEntryState(cidr, description, prefixListId);
        }
    }
}