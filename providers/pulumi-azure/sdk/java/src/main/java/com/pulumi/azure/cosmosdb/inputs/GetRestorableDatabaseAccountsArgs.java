// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRestorableDatabaseAccountsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRestorableDatabaseAccountsArgs Empty = new GetRestorableDatabaseAccountsArgs();

    /**
     * The location where the Cosmos DB Database Account.
     * 
     */
    @Import(name="location", required=true)
    private String location;

    /**
     * @return The location where the Cosmos DB Database Account.
     * 
     */
    public String location() {
        return this.location;
    }

    /**
     * The name of this Cosmos DB Database Account.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of this Cosmos DB Database Account.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetRestorableDatabaseAccountsArgs() {}

    private GetRestorableDatabaseAccountsArgs(GetRestorableDatabaseAccountsArgs $) {
        this.location = $.location;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRestorableDatabaseAccountsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRestorableDatabaseAccountsArgs $;

        public Builder() {
            $ = new GetRestorableDatabaseAccountsArgs();
        }

        public Builder(GetRestorableDatabaseAccountsArgs defaults) {
            $ = new GetRestorableDatabaseAccountsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The location where the Cosmos DB Database Account.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            $.location = location;
            return this;
        }

        /**
         * @param name The name of this Cosmos DB Database Account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetRestorableDatabaseAccountsArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
