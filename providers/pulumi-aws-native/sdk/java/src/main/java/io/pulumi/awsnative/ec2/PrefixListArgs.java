// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.ec2.enums.PrefixListAddressFamily;
import io.pulumi.awsnative.ec2.inputs.PrefixListEntryArgs;
import io.pulumi.awsnative.ec2.inputs.PrefixListTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrefixListArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrefixListArgs Empty = new PrefixListArgs();

    /**
     * Ip Version of Prefix List.
     * 
     */
    @Import(name="addressFamily", required=true)
      private final Output<PrefixListAddressFamily> addressFamily;

    public Output<PrefixListAddressFamily> getAddressFamily() {
        return this.addressFamily;
    }

    /**
     * Entries of Prefix List.
     * 
     */
    @Import(name="entries")
      private final @Nullable Output<List<PrefixListEntryArgs>> entries;

    public Output<List<PrefixListEntryArgs>> getEntries() {
        return this.entries == null ? Output.empty() : this.entries;
    }

    /**
     * Max Entries of Prefix List.
     * 
     */
    @Import(name="maxEntries", required=true)
      private final Output<Integer> maxEntries;

    public Output<Integer> getMaxEntries() {
        return this.maxEntries;
    }

    /**
     * Name of Prefix List.
     * 
     */
    @Import(name="prefixListName")
      private final @Nullable Output<String> prefixListName;

    public Output<String> getPrefixListName() {
        return this.prefixListName == null ? Output.empty() : this.prefixListName;
    }

    /**
     * Tags for Prefix List
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<PrefixListTagArgs>> tags;

    public Output<List<PrefixListTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public PrefixListArgs(
        Output<PrefixListAddressFamily> addressFamily,
        @Nullable Output<List<PrefixListEntryArgs>> entries,
        Output<Integer> maxEntries,
        @Nullable Output<String> prefixListName,
        @Nullable Output<List<PrefixListTagArgs>> tags) {
        this.addressFamily = Objects.requireNonNull(addressFamily, "expected parameter 'addressFamily' to be non-null");
        this.entries = entries;
        this.maxEntries = Objects.requireNonNull(maxEntries, "expected parameter 'maxEntries' to be non-null");
        this.prefixListName = prefixListName;
        this.tags = tags;
    }

    private PrefixListArgs() {
        this.addressFamily = Output.empty();
        this.entries = Output.empty();
        this.maxEntries = Output.empty();
        this.prefixListName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrefixListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<PrefixListAddressFamily> addressFamily;
        private @Nullable Output<List<PrefixListEntryArgs>> entries;
        private Output<Integer> maxEntries;
        private @Nullable Output<String> prefixListName;
        private @Nullable Output<List<PrefixListTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PrefixListArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressFamily = defaults.addressFamily;
    	      this.entries = defaults.entries;
    	      this.maxEntries = defaults.maxEntries;
    	      this.prefixListName = defaults.prefixListName;
    	      this.tags = defaults.tags;
        }

        public Builder addressFamily(Output<PrefixListAddressFamily> addressFamily) {
            this.addressFamily = Objects.requireNonNull(addressFamily);
            return this;
        }

        public Builder addressFamily(PrefixListAddressFamily addressFamily) {
            this.addressFamily = Output.of(Objects.requireNonNull(addressFamily));
            return this;
        }

        public Builder entries(@Nullable Output<List<PrefixListEntryArgs>> entries) {
            this.entries = entries;
            return this;
        }

        public Builder entries(@Nullable List<PrefixListEntryArgs> entries) {
            this.entries = Output.ofNullable(entries);
            return this;
        }

        public Builder maxEntries(Output<Integer> maxEntries) {
            this.maxEntries = Objects.requireNonNull(maxEntries);
            return this;
        }

        public Builder maxEntries(Integer maxEntries) {
            this.maxEntries = Output.of(Objects.requireNonNull(maxEntries));
            return this;
        }

        public Builder prefixListName(@Nullable Output<String> prefixListName) {
            this.prefixListName = prefixListName;
            return this;
        }

        public Builder prefixListName(@Nullable String prefixListName) {
            this.prefixListName = Output.ofNullable(prefixListName);
            return this;
        }

        public Builder tags(@Nullable Output<List<PrefixListTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<PrefixListTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public PrefixListArgs build() {
            return new PrefixListArgs(addressFamily, entries, maxEntries, prefixListName, tags);
        }
    }
}
