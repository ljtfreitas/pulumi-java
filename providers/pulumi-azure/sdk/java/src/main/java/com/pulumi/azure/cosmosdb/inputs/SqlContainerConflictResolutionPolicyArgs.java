// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlContainerConflictResolutionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlContainerConflictResolutionPolicyArgs Empty = new SqlContainerConflictResolutionPolicyArgs();

    /**
     * The conflict resolution path in the case of `LastWriterWins` mode.
     * 
     */
    @Import(name="conflictResolutionPath")
    private @Nullable Output<String> conflictResolutionPath;

    /**
     * @return The conflict resolution path in the case of `LastWriterWins` mode.
     * 
     */
    public Optional<Output<String>> conflictResolutionPath() {
        return Optional.ofNullable(this.conflictResolutionPath);
    }

    /**
     * The procedure to resolve conflicts in the case of `Custom` mode.
     * 
     */
    @Import(name="conflictResolutionProcedure")
    private @Nullable Output<String> conflictResolutionProcedure;

    /**
     * @return The procedure to resolve conflicts in the case of `Custom` mode.
     * 
     */
    public Optional<Output<String>> conflictResolutionProcedure() {
        return Optional.ofNullable(this.conflictResolutionProcedure);
    }

    /**
     * Indicates the conflict resolution mode. Possible values include: `LastWriterWins`, `Custom`.
     * 
     */
    @Import(name="mode", required=true)
    private Output<String> mode;

    /**
     * @return Indicates the conflict resolution mode. Possible values include: `LastWriterWins`, `Custom`.
     * 
     */
    public Output<String> mode() {
        return this.mode;
    }

    private SqlContainerConflictResolutionPolicyArgs() {}

    private SqlContainerConflictResolutionPolicyArgs(SqlContainerConflictResolutionPolicyArgs $) {
        this.conflictResolutionPath = $.conflictResolutionPath;
        this.conflictResolutionProcedure = $.conflictResolutionProcedure;
        this.mode = $.mode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlContainerConflictResolutionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlContainerConflictResolutionPolicyArgs $;

        public Builder() {
            $ = new SqlContainerConflictResolutionPolicyArgs();
        }

        public Builder(SqlContainerConflictResolutionPolicyArgs defaults) {
            $ = new SqlContainerConflictResolutionPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param conflictResolutionPath The conflict resolution path in the case of `LastWriterWins` mode.
         * 
         * @return builder
         * 
         */
        public Builder conflictResolutionPath(@Nullable Output<String> conflictResolutionPath) {
            $.conflictResolutionPath = conflictResolutionPath;
            return this;
        }

        /**
         * @param conflictResolutionPath The conflict resolution path in the case of `LastWriterWins` mode.
         * 
         * @return builder
         * 
         */
        public Builder conflictResolutionPath(String conflictResolutionPath) {
            return conflictResolutionPath(Output.of(conflictResolutionPath));
        }

        /**
         * @param conflictResolutionProcedure The procedure to resolve conflicts in the case of `Custom` mode.
         * 
         * @return builder
         * 
         */
        public Builder conflictResolutionProcedure(@Nullable Output<String> conflictResolutionProcedure) {
            $.conflictResolutionProcedure = conflictResolutionProcedure;
            return this;
        }

        /**
         * @param conflictResolutionProcedure The procedure to resolve conflicts in the case of `Custom` mode.
         * 
         * @return builder
         * 
         */
        public Builder conflictResolutionProcedure(String conflictResolutionProcedure) {
            return conflictResolutionProcedure(Output.of(conflictResolutionProcedure));
        }

        /**
         * @param mode Indicates the conflict resolution mode. Possible values include: `LastWriterWins`, `Custom`.
         * 
         * @return builder
         * 
         */
        public Builder mode(Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Indicates the conflict resolution mode. Possible values include: `LastWriterWins`, `Custom`.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        public SqlContainerConflictResolutionPolicyArgs build() {
            $.mode = Objects.requireNonNull($.mode, "expected parameter 'mode' to be non-null");
            return $;
        }
    }

}
