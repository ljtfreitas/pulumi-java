// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AccountRestoreDatabase {
    /**
     * @return A list of the collection names for the restore request. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable List<String> collectionNames;
    /**
     * @return The database name for the restore request. Changing this forces a new resource to be created.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private AccountRestoreDatabase(
        @CustomType.Parameter("collectionNames") @Nullable List<String> collectionNames,
        @CustomType.Parameter("name") String name) {
        this.collectionNames = collectionNames;
        this.name = name;
    }

    /**
     * @return A list of the collection names for the restore request. Changing this forces a new resource to be created.
     * 
     */
    public List<String> collectionNames() {
        return this.collectionNames == null ? List.of() : this.collectionNames;
    }
    /**
     * @return The database name for the restore request. Changing this forces a new resource to be created.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountRestoreDatabase defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> collectionNames;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountRestoreDatabase defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collectionNames = defaults.collectionNames;
    	      this.name = defaults.name;
        }

        public Builder collectionNames(@Nullable List<String> collectionNames) {
            this.collectionNames = collectionNames;
            return this;
        }
        public Builder collectionNames(String... collectionNames) {
            return collectionNames(List.of(collectionNames));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public AccountRestoreDatabase build() {
            return new AccountRestoreDatabase(collectionNames, name);
        }
    }
}
