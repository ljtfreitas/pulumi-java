// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The command used in the test
 * 
 */
public final class CommandResponse extends io.pulumi.resources.InvokeArgs {

    public static final CommandResponse Empty = new CommandResponse();

    /**
     * The action of the command.
     * 
     */
    @Import(name="action", required=true)
      private final String action;

    public String getAction() {
        return this.action;
    }

    /**
     * Specifies whether to run the command even if a previous command is failed.
     * 
     */
    @Import(name="alwaysRun")
      private final @Nullable Boolean alwaysRun;

    public Optional<Boolean> getAlwaysRun() {
        return this.alwaysRun == null ? Optional.empty() : Optional.ofNullable(this.alwaysRun);
    }

    /**
     * Specifies whether to apply update before the command.
     * 
     */
    @Import(name="applyUpdateBefore")
      private final @Nullable Boolean applyUpdateBefore;

    public Optional<Boolean> getApplyUpdateBefore() {
        return this.applyUpdateBefore == null ? Optional.empty() : Optional.ofNullable(this.applyUpdateBefore);
    }

    /**
     * The content of the command. The content depends on source type.
     * 
     */
    @Import(name="content", required=true)
      private final String content;

    public String getContent() {
        return this.content;
    }

    /**
     * The type of command content.
     * 
     */
    @Import(name="contentType", required=true)
      private final String contentType;

    public String getContentType() {
        return this.contentType;
    }

    /**
     * Specifies the max run time of the command.
     * 
     */
    @Import(name="maxRunTime")
      private final @Nullable Integer maxRunTime;

    public Optional<Integer> getMaxRunTime() {
        return this.maxRunTime == null ? Optional.empty() : Optional.ofNullable(this.maxRunTime);
    }

    /**
     * The name of the command.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Specifies whether to restart the VM after the command executed.
     * 
     */
    @Import(name="restartAfter")
      private final @Nullable Boolean restartAfter;

    public Optional<Boolean> getRestartAfter() {
        return this.restartAfter == null ? Optional.empty() : Optional.ofNullable(this.restartAfter);
    }

    /**
     * Specifies whether to run the command in interactive mode.
     * 
     */
    @Import(name="runAsInteractive")
      private final @Nullable Boolean runAsInteractive;

    public Optional<Boolean> getRunAsInteractive() {
        return this.runAsInteractive == null ? Optional.empty() : Optional.ofNullable(this.runAsInteractive);
    }

    /**
     * Specifies whether to run the command as administrator.
     * 
     */
    @Import(name="runElevated")
      private final @Nullable Boolean runElevated;

    public Optional<Boolean> getRunElevated() {
        return this.runElevated == null ? Optional.empty() : Optional.ofNullable(this.runElevated);
    }

    public CommandResponse(
        String action,
        @Nullable Boolean alwaysRun,
        @Nullable Boolean applyUpdateBefore,
        String content,
        String contentType,
        @Nullable Integer maxRunTime,
        String name,
        @Nullable Boolean restartAfter,
        @Nullable Boolean runAsInteractive,
        @Nullable Boolean runElevated) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.alwaysRun = alwaysRun;
        this.applyUpdateBefore = applyUpdateBefore;
        this.content = Objects.requireNonNull(content, "expected parameter 'content' to be non-null");
        this.contentType = Objects.requireNonNull(contentType, "expected parameter 'contentType' to be non-null");
        this.maxRunTime = maxRunTime;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.restartAfter = restartAfter;
        this.runAsInteractive = runAsInteractive;
        this.runElevated = runElevated;
    }

    private CommandResponse() {
        this.action = null;
        this.alwaysRun = null;
        this.applyUpdateBefore = null;
        this.content = null;
        this.contentType = null;
        this.maxRunTime = null;
        this.name = null;
        this.restartAfter = null;
        this.runAsInteractive = null;
        this.runElevated = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommandResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private @Nullable Boolean alwaysRun;
        private @Nullable Boolean applyUpdateBefore;
        private String content;
        private String contentType;
        private @Nullable Integer maxRunTime;
        private String name;
        private @Nullable Boolean restartAfter;
        private @Nullable Boolean runAsInteractive;
        private @Nullable Boolean runElevated;

        public Builder() {
    	      // Empty
        }

        public Builder(CommandResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.alwaysRun = defaults.alwaysRun;
    	      this.applyUpdateBefore = defaults.applyUpdateBefore;
    	      this.content = defaults.content;
    	      this.contentType = defaults.contentType;
    	      this.maxRunTime = defaults.maxRunTime;
    	      this.name = defaults.name;
    	      this.restartAfter = defaults.restartAfter;
    	      this.runAsInteractive = defaults.runAsInteractive;
    	      this.runElevated = defaults.runElevated;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder alwaysRun(@Nullable Boolean alwaysRun) {
            this.alwaysRun = alwaysRun;
            return this;
        }

        public Builder applyUpdateBefore(@Nullable Boolean applyUpdateBefore) {
            this.applyUpdateBefore = applyUpdateBefore;
            return this;
        }

        public Builder content(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder maxRunTime(@Nullable Integer maxRunTime) {
            this.maxRunTime = maxRunTime;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder restartAfter(@Nullable Boolean restartAfter) {
            this.restartAfter = restartAfter;
            return this;
        }

        public Builder runAsInteractive(@Nullable Boolean runAsInteractive) {
            this.runAsInteractive = runAsInteractive;
            return this;
        }

        public Builder runElevated(@Nullable Boolean runElevated) {
            this.runElevated = runElevated;
            return this;
        }
        public CommandResponse build() {
            return new CommandResponse(action, alwaysRun, applyUpdateBefore, content, contentType, maxRunTime, name, restartAfter, runAsInteractive, runElevated);
        }
    }
}
