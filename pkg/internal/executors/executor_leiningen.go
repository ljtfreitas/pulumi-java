package executors

import (
	"strings"

	"github.com/pulumi/pulumi-java/pkg/internal/fsys"
)

type leiningen struct{}

func (l leiningen) NewJavaExecutor(opts JavaExecutorOptions) (*JavaExecutor, error) {
	ok, err := l.isLeiningenProject(opts)
	if err != nil {
		return nil, err
	}
	if !ok {
		return nil, nil
	}
	probePaths := []string{opts.UseExecutor}
	if opts.UseExecutor == "" {
		probePaths = []string{"lein"}
	}
	cmd, err := fsys.LookPath(opts.WD, probePaths...)
	if err != nil {
		return nil, err
	}
	return l.newLeiningenExecutor(cmd)
}

func (leiningen) isLeiningenProject(opts JavaExecutorOptions) (bool, error) {
	if strings.Contains(opts.UseExecutor, "lein") {
		return true, nil
	}
	leinMarkers := []string{
		"project.clj",
	}
	for _, p := range leinMarkers {
		exists, err := fsys.FileExists(opts.WD, p)
		if err != nil {
			return false, err
		}
		if exists {
			return true, nil
		}
	}
	return false, nil
}

func (leiningen) newLeiningenExecutor(cmd string) (*JavaExecutor, error) {
	return &JavaExecutor{
		Cmd: cmd,
		BuildArgs: []string{
			"compile",
		},
		RunArgs: []string{
			"run",
		},
		PluginArgs: []string{
			"run -m com.pulumi.bootstrap.internal.Main packages",
		},
	}, nil
}
